package com.example.emal_setting.config.repository.impl;

import com.example.emal_setting.config.model.PageSize;
import com.example.emal_setting.config.repository.IPageSizeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository

public class PageSizeRepository implements IPageSizeRepository {
    private static Map<Integer, PageSize> pageSizeMap;
    static {
        pageSizeMap = new HashMap<>();
        pageSizeMap.put(1,new PageSize(1,5));
        pageSizeMap.put(2,new PageSize(2,10));
        pageSizeMap.put(3,new PageSize(3,15));
        pageSizeMap.put(4,new PageSize(4,25));
        pageSizeMap.put(5,new PageSize(5,50));
        pageSizeMap.put(6,new PageSize(6,100));
    }

    @Override
    public PageSize findById(int id) {
        return pageSizeMap.get(id);
    }

    @Override
    public List<PageSize> findAll() {
        return new ArrayList<>(pageSizeMap.values());
    }
}
