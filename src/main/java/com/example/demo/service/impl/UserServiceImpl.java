package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.domain.vo.ResultVo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


import java.util.List;

@Service //标记为业务层
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        //调用mapper层的方法
        List<User> users = userMapper.selectUser();
        if (users != null) {
            return users;
        }else {
            return null;
        }
    }

    //重写接口中的方法
    @Override
    public List<User> selectUserAll() {
        //调用mapper层的方法
        List<User> users = userMapper.selectUserAll();
        if (users != null) {
            return users;
        }else {
            return null;
        }
    }

    //根据手机号查询用户
    @Override
    public ResultVo selectUserByPhone(String user_phone_number) {
        //调用mapper层的方法
        User user = userMapper.selectUserByPhone(user_phone_number);
        if (user != null) {
            return new ResultVo(200,"Query Successful",user);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }

    //用户登陆
    @Override
    public ResultVo UserLoginByPhoneAndPassword(String User_phone_number, String User_password) {
        //判断手机号是否为空
        if (User_phone_number == null || User_phone_number.isEmpty()) {
            return new ResultVo(500, "Please enter your phone number!" );
        } else {
            //判断密码是否为空
            User us = userMapper.UserLoginByPhoneAndPassword(User_phone_number);
            //判断用户是否存在
            if (us == null) {
                return new ResultVo(450, "Not registered. Please register before logging in!" );
            } else if (us != null) {
                //判断密码是否正确
                if (User_password.equals(us.getUser_password())) {
                    //登陆成功
                    return new ResultVo(200,"Logging in...", us );
                } else {
                    //密码错误
                    return new ResultVo(450,"Incorrect password!" );
                }
            } else {
                //登陆失败
                return new ResultVo(500,"Login Failed!" );
            }
        }
    }

    //查询全部用户
    @Override
    public ResultVo selectUserAllResultVo() {
        List<User> users = userMapper.selectUserAll();
        if (users != null) {
            return new ResultVo(200,"Query Successful",users);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }

    //根据姓名删除用户
    @Override
    public ResultVo deleteUserByName(String user_name) {
        int i = userMapper.deleteUserByName(user_name);
        if (i > 0) {
            return new ResultVo(200,"Delete Successful",null);
        }else {
            return new ResultVo(500,"Delete Failed",null);
        }
    }

    //根据用户ID修改用户
    @Override
    public ResultVo updateUserById(User user) {
        //根据用户ID修改用户
        int i = userMapper.updateUserById(user);
        if (i > 0) {
            return new ResultVo(200, "Modification Successful", null);
        } else {
            return new ResultVo(500, "Modification Failed", null);
        }
    }


    //插入用户
    @Override
    public ResultVo insertUser(User user) {
        //判断手机号是否被注册
        User us = userMapper.selectUserByPhone(user.getUser_phonenumber());
        if (us != null) {
            return new ResultVo(450, "Phone number already registered. " +
                    "                               Please use a different phone number!" );
        }else{
            //插入用户
            int i = userMapper.insertUser(user);
            if (i > 0) {
                return new ResultVo(200, "Insertion Successful", null);
            } else {
                return new ResultVo(500, "Insertion Failed", null);
            }
        }
    }

    //模糊查询,姓名和地址
    @Override
    public ResultVo selectUserByNameAndAddress(User user) {
        List<User> users = userMapper.selectUserByNameAndAddress(user);
        if (users != null) {
            return new ResultVo(200,"Query Successful",users);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }
}

