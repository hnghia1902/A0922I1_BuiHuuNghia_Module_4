package com.example.emal_setting.config.repository.impl;

import com.example.emal_setting.config.model.Setting;
import com.example.emal_setting.config.repository.ILanguagesRepository;
import com.example.emal_setting.config.repository.IPageSizeRepository;
import com.example.emal_setting.config.repository.ISettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository

public class SettingRepository implements ISettingRepository {

    private static Map<Integer, Setting> settingMap;
    static ILanguagesRepository languagesRepository = new LanguagesRepository();
    static IPageSizeRepository pageSizeRepository = new PageSizeRepository();
        static {
            settingMap= new HashMap<>();
            settingMap.put(1,new Setting(1,languagesRepository.findById(3),pageSizeRepository.findById(2),true,"han"));
            settingMap.put(2,new Setting(2,languagesRepository.findById(1),pageSizeRepository.findById(2),true,"hana"));

        }



    @Override
    public Setting findById(int id) {
        return null;
    }

    @Override
    public List<Setting> findAll() {
        return new ArrayList<>(settingMap.values());
    }


    @Override
    public Setting findBySignarute(int id) {

        return settingMap.get(id);
    }

    @Override
    public boolean update(Setting setting) {
        if (settingMap.containsKey(setting.getId())) {
            settingMap.put(setting.getId(), setting);
            return true;
        }

        return false;
    }
}
