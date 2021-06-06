package com.anguigu.boot.dao;

import com.anguigu.boot.Service.UserService;
import com.anguigu.boot.batis.UserMapper;
import com.anguigu.boot.bean.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserDao implements UserService  {
    @Autowired
    public UserMapper userMapper;

    /**
     * 后台查询用户列表
     * @param user
     */
    @Override
    public List<TUser> userDetail() throws Exception{
        return userMapper.userDetail();
    }
}
