package demo.chk.common;

import lombok.Data;

@Data
public class Result <T> {
    public static final Integer SUCCESS=0;
    public static final Integer FAIL=-1;
    private Integer code;
    private T data;
    private String describe;
    private Result(){

    }
    public static <T> Result<T> success(T data,String message){
        Result<T> result=new Result<T>();
        result.code=SUCCESS;
        result.describe=message;
        result.data=data;
        return result;
    }
    public static <T>Result<T> success(T data){
        return success(data,null);
    }
    public static <T>Result<T> success(){
        return success(null);
    }
    public static <T> Result<T> fail(String message){
        Result result=new Result();
        result.code=FAIL;
        result.describe=message;
        return result;
    }
}
