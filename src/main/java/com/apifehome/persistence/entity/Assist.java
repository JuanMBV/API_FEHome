package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class Assist {
    private int idAssist;
    private String name;
    private String effect;
    private int range;
    private Integer spCost; // Use Integer for nullable Int
    private int exclusive;
    private int healerSkill;
}
