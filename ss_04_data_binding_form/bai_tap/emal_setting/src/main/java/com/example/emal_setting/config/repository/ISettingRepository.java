package com.example.emal_setting.config.repository;

import com.example.emal_setting.config.model.Setting;

public interface ISettingRepository extends Repository<Setting>{
     Setting findBySignarute(int id);
     boolean update(Setting setting);

}
