package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class SystemController {

    @RequestMapping("/UserIndex")
    public String goUserIndex() {
        return "/user_html/userIndex";
    }

    @RequestMapping("/UserLogin")
    public String goUserLogin() {
        return "/user_html/userLogin";
    }

    @RequestMapping("/UserList")
    public String goUserList() {
        return "/user_html/userList";
    }

    @RequestMapping("/UserUpdate")
    public String goUserAdd() {
        return "/user_html/updateUser";
    }

    @RequestMapping("/UserInsert")
    public String goUserInsert() {
        return "/user_html/userInsert";
    }

    @RequestMapping("/SeedList")
    public String goSeedList() {
        return "/seed_html/seedList";
    }

    @RequestMapping("/SeedInsert")
    public String goSeedInsert() {
        return "/seed_html/seedInsert";
    }

    @RequestMapping("/SeedUpdate")
    public String goSeedUpdate() {
        return "/seed_html/updateSeed";
    }






}
