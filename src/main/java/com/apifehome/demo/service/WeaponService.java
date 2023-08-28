package com.apifehome.demo.service;

import com.apifehome.persistence.repository.WeaponRepository;

public class WeaponService {
    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }
}
