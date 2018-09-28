package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品地区表
 */
@Getter
@Setter
public class Vendor_district implements Serializable {
        private Integer vd_id; 	    //商品地区id
        private String vd_name;	//地区名称
}
