package com.cssl.service.impl;

import com.cssl.dao.searchDao;
import com.cssl.pojo.Product_brand;
import com.cssl.pojo.Product_details;
import com.cssl.pojo.Product_type;
import com.cssl.pojo.Vendor_district;
import com.cssl.service.searchService;
import com.cssl.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: taoshopping01
 * @Date: 2018/9/13 17:50
 * @Author: misliu
 * @Description:
 */
@Service
@Transactional
@AutoConfigureAfter(searchService.class)
public class searchServiceImpl implements searchService {

    @Autowired
    private searchDao seaDao;

    //查询商品  按照 地区vd_id  或者 类型 pt_id 或者   品牌pb_id  默认查询所有
    @Override
    public List<Product_details> findByPd(Product_details Product_detail) {
        return seaDao.findByPd(Product_detail);
    }

    //查询所有商品品牌
    @Override
    public List<Product_brand> findByPb() {
        return seaDao.findByPb();
    }

    //查询所有商品类型
    @Override
    public List<Product_type> findByPt() {
        return seaDao.findByPt();
    }

    //查询所有卖家地区
    @Override
    public List<Vendor_district> findByVd() {
        return seaDao.findByVd();
    }
}
