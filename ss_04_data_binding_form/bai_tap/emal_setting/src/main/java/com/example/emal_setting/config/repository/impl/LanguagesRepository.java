package com.example.emal_setting.config.repository.impl;

import com.example.emal_setting.config.model.Languages;
import com.example.emal_setting.config.repository.ILanguagesRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class LanguagesRepository implements ILanguagesRepository {
    private static Map<Integer, Languages> languagesMap;
    static {
        languagesMap = new HashMap<>();
        languagesMap.put(1,new Languages(1,"English"));
        languagesMap.put(2,new Languages(2,"Vietnamese"));
        languagesMap.put(3,new Languages(3,"Japanese"));
        languagesMap.put(4,new Languages(4,"Chinese"));
    }

    @Override
    public Languages findById(int id) {
        return languagesMap.get(id);
    }

    @Override
    public List<Languages> findAll() {
        return new ArrayList<>(languagesMap.values());
    }
}
