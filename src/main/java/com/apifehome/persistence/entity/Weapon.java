package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class Weapon {
    private int idWeapon;
    private String name;
    private int baseEffectId;
    private String weaponType;
    private String colorWeapon;
    private int might;
    private int range;
    private Integer spCost;
    private int exclusive;
    private int refinablePrf;
    private Integer refinePrfEffectId;
    private int refinable;
    private Integer refineEffectId;
}
