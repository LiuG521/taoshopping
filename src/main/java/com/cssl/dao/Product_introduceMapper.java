package com.cssl.dao;

import com.cssl.pojo.Product_introduce;

import java.util.List;

/**
 * 商品详情的dao
 */
public interface Product_introduceMapper {
       List<Product_introduce> sellistpibypd_id(int pd_id);
}
