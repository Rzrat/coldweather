package com.example.xun.coldweather.util;

import android.text.TextUtils;

import com.example.xun.coldweather.db.City;
import com.example.xun.coldweather.db.Country;
import com.example.xun.coldweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

/**
 * Created by Xun on 2018/3/21.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces=new JSONArray(response);//将相应的内容放置在JSON数组中
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject=allProvinces.getJSONObject(i);//为每一天数组内容生成对象
                    Province  province=new Province();//实例化对象Procince
                    province.setProvinceName(provinceObject.getString("name"));//把服务器返回的数据表头为name的数据发送到Province类中
                    province.setProvinceCode(provinceObject.getInt("id"));//把服务器返回的数据表头为id的数据发送到Province类中
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response, int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities =new JSONArray(response);
                for (int i=0;i<allCities.length();i++){
                    JSONObject cityObject=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCitycode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response, int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounties=new JSONArray(response);
                for (int i=0;i<allCounties.length();i++){
                    JSONObject countyObject=allCounties.getJSONObject(i);
                    Country country=new Country();
                    country.setCountryName(countyObject.getString("name"));
                    country.setWeatherId(countyObject.getInt("id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

}
