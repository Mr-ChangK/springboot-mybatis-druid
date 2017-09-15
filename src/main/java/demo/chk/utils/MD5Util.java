package demo.chk.utils;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@Slf4j
public class MD5Util {
    private MD5Util(){

    }
    public static String encryption(String password){
        String result=null;
        try {
            MessageDigest messageDigest =MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            byte [] resultByte=messageDigest.digest();
            result = DatatypeConverter.printHexBinary(resultByte).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            log.info("MD5加密错误");
        }
        return result;
    }
}
