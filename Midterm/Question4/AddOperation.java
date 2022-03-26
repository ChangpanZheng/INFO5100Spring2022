package Question4;

public class AddOperation implements MathOperation {
    public int performOperation(int num1, int num2){
        // we add num1 and num2 together and return the sum
        int sum = num1 + num2;
        return sum;
    }
}