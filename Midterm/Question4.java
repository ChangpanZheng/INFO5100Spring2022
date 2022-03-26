public class Question4 {
}

interface MathOperation {
    public int performOperation(int num1, int num2);
}

class AddOperation implements MathOperation {
    public int performOperation(int num1, int num2){
        // we add num1 and num2 together and return the sum
        int sum = num1 + num2;
        return sum;
    }
}

class SubtractOperation implements MathOperation {
    public int performOperation(int num1, int num2){
        // we get the difference between num1 and num2 the result
        int result = num1 - num2;
        return result;
    }
}

class MultiplyOperation implements MathOperation {
    public int performOperation(int num1, int num2){
        // we mutiple num1 and num2 and return the result
        int resultNum = num1 * num2;
        return resultNum;
    }
}

class Context {
    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }

    public int execute(int num1, int num2) {
        return operation.performOperation(num1, num2);
    }
}

class Client {
    public static void main(String[] args) {
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20

        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10

        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
    }
}
