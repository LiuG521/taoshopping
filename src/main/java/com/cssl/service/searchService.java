package com.cssl.service;

import com.cssl.pojo.Product_brand;
import com.cssl.pojo.Product_details;
import com.cssl.pojo.Product_type;
import com.cssl.pojo.Vendor_district;

import java.util.List;

/**
 * @program: taoshopping01
 * @Date: 2018/9/13 17:49
 * @Author: misliu
 * @Description:
 */
public interface searchService {

    //查询商品  按照 地区vd_id  或者 类型 pt_id 或者   品牌pb_id  默认查询所有
    List<Product_details> findByPd(Product_details Product_detail);

    //查询所有商品品牌
    List<Product_brand> findByPb();

    //查询所有商品类型
    List<Product_type> findByPt();

    //查询所有卖家地区
    List<Vendor_district> findByVd();
}
