package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class WeaponEffect {
    private int idWeaponEffect;
    private String effect;
    private Integer hpBoost;
    private Integer atkBoost;
    private Integer spdBoost;
    private Integer defBoost;
    private Integer resBoost;
    private String imageIcon;
}
