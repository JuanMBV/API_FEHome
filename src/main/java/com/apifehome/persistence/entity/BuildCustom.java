package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class BuildCustom {
    private int idBuildCustom;
    private int heroId;
    private int merges;
    private int dracoflowers;
    private String asset;
    private String ascendedAsset;
    private String flaw;
    private Integer summonSupport;
    private Integer weaponId;
    private Integer assistId;
    private Integer specialId;
    private Integer passiveAId;
    private Integer passiveBId;
    private Integer passiveCId;
    private Integer passiveSId;
}
