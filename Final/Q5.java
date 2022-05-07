import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        int[] array1 = {3,2,1,5,6,4};
        int[] array2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(array1, 2));
        System.out.println(findKthLargest(array2, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        //TODO: Write your code here
        nums = nums;
        int l = nums.length;
        // kth largest is (N - k + 1)th smallest
        // which has the index of (N - K)
        return quickselect(0, l - 1, l - k, nums);
    }

    public static int quickselect(int left, int right, int k_smallest, int[] nums) {
        // if the array contains only one element
        if (left == right) {
            return nums[left];
        }

        // get a random index between left and right
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left);

        pivot_index = partition(left, right, pivot_index, nums);

        // the pivot is on the N-K order
        if (k_smallest == pivot_index) {
            return nums[k_smallest];
        } else if (k_smallest < pivot_index) {
            return quickselect(left, pivot_index - 1, k_smallest, nums);
        } else {
            return quickselect(pivot_index + 1, right, k_smallest, nums);
        }
    }

    public static int partition(int left, int right, int pivot_index, int[] nums) {
        int pivot = nums[pivot_index];

        // move pivot to right
        swap(pivot_index, right, nums);
        int store_index = left;

        // move all smaller elements to the left of pivot
        for (int i = left; i <= right; i++) {
            if (nums[i] < pivot) {
                swap(store_index, i, nums);
                store_index++;
            }
        }

        // move pivot to its correct place
        swap(store_index, right, nums);
        return store_index;
    }

    public static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
