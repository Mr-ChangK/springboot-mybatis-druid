package demo.chk.service.impl;

import demo.chk.common.DemoUserException;
import demo.chk.mapper.UserMapper;
import demo.chk.service.UserService;
import demo.chk.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        if (userMapper.selectUser(username) != null) {
            throw new DemoUserException("不能重复注册");
        }
        password = MD5Util.encryption(password);
        try {
            userMapper.insertUser(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DemoUserException(1, "注册失败");
        }
    }
}
