package com.example.xun.coldweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Xun on 2018/3/21.
 */

public class City extends DataSupport {
    private int id;
    private int Citycode;
    private String CityName;
    private int provinceId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getCityCode(){
        return Citycode;
    }
    public void setCitycode(int Citycode){
        this.Citycode=Citycode;
    }
    public String getCityName(){
        return CityName;
    }
    public void setCityName(String CityName){
        this.CityName=CityName;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
