package com.qf.controller;

import com.qf.entity.TProductType;
import com.qf.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class IndexController {
        @Autowired
        private IIndexService iIndexService;
        @RequestMapping("tProduct")
        public  List<TProductType>  tProduct(){
           return iIndexService.selectTproductTyep();
        }
}
