package Y2异常处理.Y9自定义Exception练习;

/**
 * @Author: yqy
 * @Date: 2021/06/08/17:35
 * @Description:
 */
public class RegisterRuntimeException extends RuntimeException{
    public RegisterRuntimeException() {
    }
    public RegisterRuntimeException(String message) {
        super(message);
    }
}
