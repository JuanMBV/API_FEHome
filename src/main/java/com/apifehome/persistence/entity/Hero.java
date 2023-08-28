package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class Hero {
    private int idHeroes;
    private String name;
    private String title;
    private int legendary;
    private String legendaryElement;
    private String legendaryBuff;
    private int newHero;
    private int seasonal;
    private String seasonalType;
    private int duo;
    private String duoSkill;
    private int harmonic;
    private String harmonicSkill;
    private int minRarity;
    private int maxRarity;
    private String weaponType;
    private String color;
    private String moveType;
    private int maxDracoFlowers;
    private int heroStatsId;
    private String imageThumbnail;
    private int resplendent;
    private int imgFullNId;
    private int imgFullRId;
}
