package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class HeroStats {
    private int idHeroStats;
    private int hpBase;
    private int atkBase;
    private int spdBase;
    private int defBase;
    private int resBase;
    private int hpBoon;
    private int atkBoon;
    private int spdBoon;
    private int defBoon;
    private int resBoon;
    private int hpBane;
    private int atkBane;
    private int spdBane;
    private int defBane;
    private int resBane;
}
