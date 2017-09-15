package demo.chk.controller;

import com.google.common.base.Strings;
import demo.chk.common.DemoUserException;
import demo.chk.common.Result;
import demo.chk.entity.User;
import demo.chk.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserService userService;
    @PostMapping("/register")
    public Result<Void> login(String username,String password){
        try{
            if(Strings.isNullOrEmpty(username)||Strings.isNullOrEmpty(password)){
                return Result.fail("用户名或密码不能为空");
            }
            userService.register(username,password);
        }catch (DemoUserException e){
            return Result.fail(e.getMessage());
        }
        return Result.success();
    }
}
