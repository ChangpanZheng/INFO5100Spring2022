package Question4;

public class Context {
    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }

    public int execute(int num1, int num2) {
        return operation.performOperation(num1, num2);  // match the operation
    }
}
