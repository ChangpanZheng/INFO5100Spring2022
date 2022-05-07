public class Q4 {
    public static void main(String[] args) {
        printResult(sumZero(2));
        printResult(sumZero(4));
        printResult(sumZero(7));
    }

    public static int[] sumZero(int n) {
        //TODO: Write your code here
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i * 2 - n + 1;
        }

        return array;
    }

    private static void printResult(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
