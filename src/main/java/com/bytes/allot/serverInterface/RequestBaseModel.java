package com.bytes.allot.serverInterface;

import com.google.gson.Gson;

/**
 * Created by PeterZhou on 15/6/4.
 */
public class RequestBaseModel {
    protected int devType;
    protected String sysVer;
    protected String appVer;


    RequestBaseModel(int mDevType, String mSysType, String mAppVer){
        this.devType = mDevType;
        this.sysVer = mSysType;
        this.appVer = mAppVer;
    }

    public RequestBaseModel(String mJsonStr){
        Gson gson = new Gson();
        RequestBaseModel gsonObj;
        gsonObj = gson.fromJson(mJsonStr, RequestBaseModel.class);
        this.devType = gsonObj.devType;
        this.sysVer = gsonObj.sysVer;
        this.appVer = gsonObj.appVer;
    }

    public String convertToJson(){
        Gson gson = new Gson();
        String jsonString = gson.toJson(this);
        return jsonString;
    }


}
