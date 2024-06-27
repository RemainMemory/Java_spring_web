package com.example.demo.service.impl;

import com.example.demo.domain.Seed;
import com.example.demo.domain.vo.ResultVo;
import com.example.demo.mapper.SeedMapper;
import com.example.demo.service.SeedService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


import java.util.List;

@Service //标记为业务层
public class SeedServiceImpl implements SeedService {

    @Resource
    private SeedMapper seedMapper;

    //重写接口中的方法
    @Override
    //查询所有种子
    public List<Seed> selectSeedAll() {
        //调用mapper层的方法
        List<Seed> seeds = seedMapper.selectSeedAll();
        if (seeds != null) {
            return seeds;
        }else {
            return null;
        }
    }

    //重写接口中的方法
    @Override
    //查询所有种子
    public List<Seed> selectSeed() {
        //调用mapper层的方法
        List<Seed> seeds = seedMapper.selectSeed();
        if (seeds != null) {
            return seeds;
        }else {
            return null;
        }
    }

    //重写接口中的方法
    @Override
    //根据种子名查询种子
    public ResultVo selectSeedByName(String seed_name) {
        //调用mapper层的方法
        Seed seed = seedMapper.selectSeedByName(seed_name);
        if (seed != null) {
            return new ResultVo(200,"Query Successful",seed);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }

    //重写接口中的方法
    @Override
    //查询所有种子
    public ResultVo selectSeedAllResultVo() {
        //调用mapper层的方法
        List<Seed> seeds = seedMapper.selectSeedAll();
        if (seeds != null) {
            return new ResultVo(200,"Query Successful",seeds);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }

    //重写接口中的方法
    @Override
    //根据种子名删除种子
    public ResultVo deleteSeedByName(String seed_name) {
        //调用mapper层的方法
        int i = seedMapper.deleteSeedByName(seed_name);
        if (i > 0) {
            return new ResultVo(200,"Delete Successful",null);
        }else {
            return new ResultVo(500,"Delete Failed",null);
        }
    }

    //重写接口中的方法
    @Override
    //根据种子ID修改种子
    public ResultVo updateSeedById(Seed seed) {
        //调用mapper层的方法
        int i = seedMapper.updateSeedById(seed);
        if (i > 0) {
            return new ResultVo(200,"Modification Successful",null);
        }else {
            return new ResultVo(500,"Modification Failed",null);
        }
    }

    //重写接口中的方法
    @Override
    //插入种子
    public ResultVo insertSeed(Seed seed) {
        //判断种子名是否已存在
        Seed se = seedMapper.selectSeedByName(seed.getSeed_name());
        if (se != null) {
            return new ResultVo(450,"Seed name already exists. " +
                    "Please use a different seed name!" );
        }else{
            //插入种子
            int i = seedMapper.insertSeed(seed);
            if (i > 0) {
                return new ResultVo(200, "Insertion Successful", null);
            } else {
                return new ResultVo(500, "Insertion Failed", null);
            }
        }
    }

    //重写接口中的方法
    @Override
    //模糊查询,种子名和种子生长季节，生长周期
    public ResultVo selectSeedByNameAndSeasonAndCycle(Seed seed) {
        //调用mapper层的方法
        List<Seed> seeds = seedMapper.selectSeedByNameAndSeasonAndCycle(seed);
        if (seeds != null) {
            return new ResultVo(200,"Query Successful",seeds);
        }else {
            return new ResultVo(500,"Query Failed",null);
        }
    }

}
