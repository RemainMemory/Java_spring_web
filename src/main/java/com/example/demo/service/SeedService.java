package com.example.demo.service;

import com.example.demo.domain.Seed;
import com.example.demo.domain.vo.ResultVo;

import java.util.List;

public interface SeedService {

    List<Seed> selectSeedAll();
    List<Seed> selectSeed();

    //根据种子名查询种子
    ResultVo selectSeedByName(String seed_name);
    //查询所有种子
    ResultVo selectSeedAllResultVo();
    //根据种子名删除种子
    ResultVo deleteSeedByName(String seed_name);
    //根据种子ID修改种子
    ResultVo updateSeedById(Seed seed);
    //插入种子
    ResultVo insertSeed(Seed seed);
    //模糊查询,种子名和种子生长季节，生长周期
    ResultVo selectSeedByNameAndSeasonAndCycle(Seed seed);


}
