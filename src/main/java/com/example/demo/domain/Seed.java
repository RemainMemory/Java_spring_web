package com.example.demo.domain;

public class Seed {
    private Integer seed_id;
    private String seed_name;
    private String seed_price;
    //种子生长季节
    private String seed_season;
    //种子生长时间（天）
    private String seed_maturation_time;
    private String seed_type;
    private String seed_image;

    public Seed() {
    }

    //全参构造
    public Seed(Integer seed_id, String seed_name, String seed_price, String seed_season, String seed_maturation_time, String seed_type, String seed_image) {
        this.seed_id = seed_id;
        this.seed_name = seed_name;
        this.seed_price = seed_price;
        this.seed_season = seed_season;
        this.seed_maturation_time = seed_maturation_time;
        this.seed_type = seed_type;
        this.seed_image = seed_image;
    }

    //get和set方法通过New->Getter and Setter生成

    public Integer getSeed_id() {
        return seed_id;
    }

    public void setSeed_id(Integer seed_id) {
        this.seed_id = seed_id;
    }

    public String getSeed_name() {
        return seed_name;
    }

    public void setSeed_name(String seed_name) {
        this.seed_name = seed_name;
    }

    public String getSeed_price() {
        return seed_price;
    }

    public void setSeed_price(String seed_price) {
        this.seed_price = seed_price;
    }

    public String getSeed_season() {
        return seed_season;
    }

    public void setSeed_season(String seed_season) {
        this.seed_season = seed_season;
    }

    public String getSeed_maturation_time() {
        return seed_maturation_time;
    }

    public void setSeed_maturation_time(String seed_maturation_time) {
        this.seed_maturation_time = seed_maturation_time;
    }

    public String getSeed_type() {
        return seed_type;
    }

    public void setSeed_type(String seed_type) {
        this.seed_type = seed_type;
    }

    public String getSeed_image() {
        return seed_image;
    }

    public void setSeed_image(String seed_image) {
        this.seed_image = seed_image;
    }
}

