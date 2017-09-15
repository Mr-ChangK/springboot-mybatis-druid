package demo.chk.common;

public class DemoUserException extends RuntimeException {
    private Integer code;
    private String message;

    public DemoUserException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
    public DemoUserException(String message){
        this(null,message);
    }

    public DemoUserException() {
        this(null);
    }
}
