package com.apifehome.demo.service;

import com.apifehome.persistence.repository.WeaponEffectRepository;

public class WeaponEffectService {
    private final WeaponEffectRepository weaponEffectRepository;

    public WeaponEffectService(WeaponEffectRepository weaponEffectRepository){
        this.weaponEffectRepository = weaponEffectRepository;
    }
}
