package com.example.xun.coldweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Xun on 2018/3/21.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getid(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(){
        this.provinceName=provinceName;
    }
    public  int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(){
        this.provinceCode=provinceCode;
    }
}
