package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class Special {
    private int idSpecial;
    private String name;
    private String effect;
    private int cooldown;
    private Integer spCost;
    private String weaponTypeRestriction;
    private int exclusive;
    private int healerSkill;
}
