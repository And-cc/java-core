package Y2异常处理.Y9自定义Exception练习;

public class RegisterException extends Exception{
    public RegisterException() {
        super();
    }
    public RegisterException(String message) {
        super(message);
    }
}
