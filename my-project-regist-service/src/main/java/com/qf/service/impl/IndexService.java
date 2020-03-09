package com.qf.service.impl;

import com.qf.entity.TProductType;
import com.qf.mapper.TProductTypeMapper;
import com.qf.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexService implements IIndexService {
    @Autowired
    private TProductTypeMapper tProductTypeMapper;
    @Override
    public List<TProductType> selectTproductTyep() {
        List<TProductType> tProductTypes = tProductTypeMapper.selectTProductType();
        return tProductTypes;
    }
}
