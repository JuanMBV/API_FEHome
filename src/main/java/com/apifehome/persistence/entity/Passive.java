package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class Passive {
    private int idPassive;
    private String name;
    private String effect;
    private Integer hpBoost;
    private Integer atkBoost;
    private Integer spdBoost;
    private Integer defBoost;
    private Integer resBoost;
    private Integer spCost;
    private String slot;
    private int seal;
    private int exclusive;
    private String moveType;
    private String colorRestriction;
    private int range;
    private int healerSkill;
}
