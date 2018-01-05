package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by haojing on 2018/1/5.
 * id每个实体类中应有的字段
 * provinceName记录省的名字
 * provinceCode记录省的代号
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private  int provinceCode;
    public  int getId(){
        return id;
    }
    public void setId(int id ){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public  void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public  int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}


