package com.apifehome.persistence.entity;

import lombok.Data;

@Data
public class BuildBase {
    private int idBuildBase;
    private int heroId;
    private Integer weaponPrfId;
    private Integer weaponNoPrfId;
    private Integer assistId;
    private Integer specialId;
    private Integer passiveAId;
    private Integer passiveBId;
    private Integer passiveCId;
}
