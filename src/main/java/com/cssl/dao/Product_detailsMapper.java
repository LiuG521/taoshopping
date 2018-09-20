package com.cssl.dao;

import com.cssl.pojo.Product_details;

import java.util.List;

/**
 * Created by Administrator on 2018/9/14.
 */
public interface Product_detailsMapper {
    //按照类别id查询商品信息
    public List<Product_details> sellistpdbypt_id(int pt_id);

    //按商品id查询商品信息
    public Product_details selpdbypd_id(int pd_id);
}
