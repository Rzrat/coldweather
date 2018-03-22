package com.example.xun.coldweather.db;

import org.litepal.crud.DataSupport;

import java.net.PortUnreachableException;

/**
 * Created by Xun on 2018/3/21.
 */

public class Country extends DataSupport {
    private int id;
    private int weatherId;
    private String CountryName;
    private int CityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
   public int getWeatherId(){
        return weatherId;
   }
   public void setWeatherId(int weatherId){
       this.weatherId=weatherId;
   }
    public String getCountryName(){
        return CountryName;
    }
    public void setCountryName(String CountryName){
        this.CountryName=CountryName;
    }
    public int getCityId(){
        return CityId;
    }
    public void setCityId(int CityId){
        this.CityId=CityId;
    }

}
