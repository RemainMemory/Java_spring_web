package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.domain.vo.ResultVo;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller//标记为控制层
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/selectUser")
    @ResponseBody
    //查询所有用户
    public List<User> selectUserController(){
        List<User> users = userService.selectUser();
        if (users != null) {
            return users;
        }else {
            return null;
        }

    }


    //根据手机号查询用户
    @RequestMapping("/selectUserByPhone")//url地址为selectUserByPhone
    @ResponseBody //返回json格式
    public ResultVo selectUserByPhone(String user_phone_number){
        return userService.selectUserByPhone(user_phone_number);
    }

    //用户登陆
    @RequestMapping("/UserLoginByPhoneAndPassword")//url地址为UserLoginByPhoneAndPassword
    @ResponseBody //返回json格式, @RequestBody接收json格式
    public ResultVo UserLoginByPhoneAndPassword(String user_phone_number, String user_password){
        return userService.UserLoginByPhoneAndPassword(user_phone_number, user_password);
    }

    //查询全部用户
    @RequestMapping("/selectUserAllResultVoController")
    @ResponseBody
    public ResultVo selectUserAllResultVo(){
        return userService.selectUserAllResultVo();
    }

    //根据姓名删除用户
    @RequestMapping("/deleteUserByNameController")
    @ResponseBody
    public ResultVo deleteUserByName(String user_name){
        return userService.deleteUserByName(user_name);
    }

    //根据用户ID修改用户
    @RequestMapping("/updateUserByIdController")
    @ResponseBody
    public ResultVo updateUserById(@RequestBody User user){
        return userService.updateUserById(user);
    }

    //插入用户
    @RequestMapping("/insertUser")
    @ResponseBody
    public ResultVo insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    //模糊查询,姓名和地址
    @RequestMapping("/selectUserByNameAndAddress")
    @ResponseBody
    public ResultVo selectUserByNameAndAddress(@RequestBody User user){
        return userService.selectUserByNameAndAddress(user);
    }










}
