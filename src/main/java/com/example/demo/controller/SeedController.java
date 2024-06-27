package com.example.demo.controller;


import com.example.demo.domain.Seed;
import com.example.demo.domain.vo.ResultVo;
import com.example.demo.service.SeedService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller//标记为控制层
public class SeedController {

    @Resource
    private SeedService seedService;

    @RequestMapping("/selectSeed")
    @ResponseBody
    //查询所有种子
    public List<Seed> selectSeedController(){
        List<Seed> seeds = seedService.selectSeed();
        if (seeds != null) {
            return seeds;
        }else {
            return null;
        }
    }

    //查询所有种子
    @RequestMapping("/selectAll")
    @ResponseBody //返回json格式

    public List<Seed> selectSeedAllController(){
        List<Seed> seeds = seedService.selectSeedAll();
        if (seeds != null) {
            return seeds;
        }else {
            return null;
        }
    }

    //根据种子名查询种子
    @RequestMapping("/selectSeedByName")//url地址为selectSeedByName
    @ResponseBody //返回json格式
    public ResultVo selectSeedByName(String seed_name){
        return seedService.selectSeedByName(seed_name);
    }

    //查询所有种子
    @RequestMapping("/selectSeedAllResultVo")//url地址为selectSeedAllResultVo
    @ResponseBody //返回json格式
    public ResultVo selectSeedAllResultVo(){
        return seedService.selectSeedAllResultVo();
    }

    //根据种子ID修改种子
    @RequestMapping("/updateSeedById")//url地址为updateSeedById
    @ResponseBody //返回json格式
    public ResultVo updateSeedById(@RequestBody Seed seed){
        return seedService.updateSeedById(seed);
    }

    //根据种子名删除种子
    @RequestMapping("/deleteSeedByName")//url地址为deleteSeedByName
    @ResponseBody //返回json格式
    public ResultVo deleteSeedByName(String seed_name){
        return seedService.deleteSeedByName(seed_name);
    }

    //插入种子
    @RequestMapping("/insertSeed")//url地址为insertSeed
    @ResponseBody //返回json格式
    public ResultVo insertSeed(@RequestBody Seed seed){
        return seedService.insertSeed(seed);
    }

    //模糊查询,种子名和种子生长季节，生长周期
    @RequestMapping("/selectSeedByNameAndSeasonAndCycle")//url地址为selectSeedByNameAndSeasonAndCycle
    @ResponseBody //返回json格式
    public ResultVo selectSeedByNameAndSeasonAndCycle(@RequestBody Seed seed){
        return seedService.selectSeedByNameAndSeasonAndCycle(seed);
    }



}
