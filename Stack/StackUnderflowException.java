package Stack;

public class StackUnderflowException extends RuntimeException {
	public StackUnderflowException() {
		super("Stack Underflow Exception");
	}
}
