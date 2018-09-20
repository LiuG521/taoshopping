package com.cssl.service.impl;


import com.cssl.dao.Product_introduceMapper;
import com.cssl.pojo.Product_introduce;
import com.cssl.service.Product_introduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/15.
 */
@Service
public class Product_introduceServiceImpl implements Product_introduceService {
    @Autowired
    Product_introduceMapper pi;

    //按商品id查询详情
    public List<Product_introduce> sellistpibypd_id(int pd_id) {
        return pi.sellistpibypd_id(pd_id);
    }
}
