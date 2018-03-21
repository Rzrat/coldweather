package com.example.xun.coldweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Xun on 2018/3/21.
 */

public class City extends DataSupport {
    private int id;
    private int Cityid;
    private String CityName;
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public int getCityid(){
        return Cityid;
    }
    public void setCityid(){
        this.Cityid=Cityid;
    }
    public String getCityName(){
        return CityName;
    }
    public void setCityName(){
        this.CityName=CityName;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(){
        this.provinceId=provinceId;
    }
}
