package com.example.demo.mapper;

import com.example.demo.domain.Seed;
import com.example.demo.domain.vo.ResultVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeedMapper {
    //定义一个方法，返回值是一个list集合，方法名是selectSeedAll
    //方法名要和xml文件中的id一致
    //方法的返回值要和xml文件中的resultType一致
    //方法的参数要和xml文件中的parameterType一致
    //方法的返回值要和xml文件中的resultType一致
    List<Seed> selectSeedAll();
    List<Seed> selectSeed();

    //根据种子名查询种子
    Seed selectSeedByName(String seed_name);

    //根据种子ID修改种子
    int updateSeedById(Seed seed);

    //根据种子名删除种子
    int deleteSeedByName(String seed_name);

    //插入种子
    int insertSeed(Seed seed);

    //模糊查询,种子名和种子生长季节，生长周期
    List<Seed> selectSeedByNameAndSeasonAndCycle(Seed seed);

}