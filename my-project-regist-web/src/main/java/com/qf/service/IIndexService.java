package com.qf.service;

import com.qf.entity.TProductType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("regist-service")
public interface IIndexService {
    @RequestMapping("index/tProduct")
    List<TProductType> selectTproductTyep();
}
