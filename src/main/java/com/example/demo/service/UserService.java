package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.vo.ResultVo;

import java.util.List;

public interface UserService {
    //定义一个方法，返回值是一个list集合，方法名是selectUserAll
    List<User> selectUserAll();
    List<User> selectUser();
    //根据手机号码查询用户
    ResultVo selectUserByPhone(String user_phone_number);
    //用户登陆
    ResultVo UserLoginByPhoneAndPassword(String User_phone_number, String User_password);
    //查询全部用户
    ResultVo selectUserAllResultVo();
    //根据姓名删除用户
    ResultVo deleteUserByName(String user_name);
    //根据用户ID修改用户
    ResultVo updateUserById(User user);
    //插入用户
    ResultVo insertUser(User user);
    //模糊查询,姓名和地址
    ResultVo selectUserByNameAndAddress(User user);



}
