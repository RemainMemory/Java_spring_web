package com.example.demo.domain;


/*对应数据库中User表*/
public class User {
    private Integer User_id;//对应databse中的User_id
    private String User_name;//对应databse中的User_name
    private String User_password;//对应databse中的User_password
    private String User_gender;
    private String User_phone_number;
    private String User_address;
    private String User_email;

    //构造器通过New->Constructor生成
    //无参构造

    public User() {
    }
    //全参构造

    public User(Integer user_id, String user_name, String user_password, String user_gender, String user_phone_number, String user_address, String user_email) {
        User_id = user_id;
        User_name = user_name;
        User_password = user_password;
        User_gender = user_gender;
        User_phone_number = user_phone_number;
        User_address = user_address;
        User_email = user_email;
    }


    //get和set方法通过New->Getter and Setter生成


    public Integer getUser_id() {
        return User_id;
    }

    public void setUser_id(Integer user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_password() {
        return User_password;
    }

    public void setUser_password(String user_password) {
        User_password = user_password;
    }

    public String getUser_gender() {
        return User_gender;
    }

    public void setUser_gender(String user_gender) {
        User_gender = user_gender;
    }

    public String getUser_phonenumber() {
        return User_phone_number;
    }

    public void setUser_phonenumber(String user_phonenumber) {
        User_phone_number = user_phonenumber;
    }

    public String getUser_address() {
        return User_address;
    }

    public void setUser_address(String user_address) {
        User_address = user_address;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String user_email) {
        User_email = user_email;
    }
}

//class person{
//    User user;
//    user = new User();//通过new关键字创建对象
//    user.
//}
