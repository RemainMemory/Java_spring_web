package com.example.demo.mapper;


import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


//class修饰表示这是一个类，要将mapper层的类定义为接口,用interface修饰
@Mapper //标记为mapper层,数据库操作层
public interface UserMapper {
    //定义一个方法，返回值是一个list集合，方法名是selectUserAll
    //方法名要和xml文件中的id一致
    //方法的返回值要和xml文件中的resultType一致
    //方法的参数要和xml文件中的parameterType一致
    //方法的返回值要和xml文件中的resultType一致
    List<User> selectUserAll();
    List<User> selectUser();

    //根据手机号查询用户
    User selectUserByPhone(String user_phone_number);
    //用户登陆
    User UserLoginByPhoneAndPassword(String user_phone_number);

    //根据姓名删除用户
    int deleteUserByName(String user_name);

    //根据用户ID修改用户
    int updateUserById(User user);

    //插入用户
    int insertUser(User user);

    //模糊查询,姓名和地址
    List<User> selectUserByNameAndAddress(User user);








}
