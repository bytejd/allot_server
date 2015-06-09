package com.bytes.allot.model.reqModel;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

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
        try {
            gsonObj = gson.fromJson(mJsonStr,RequestBaseModel.class);
            this.devType = gsonObj.devType;
            this.sysVer = gsonObj.sysVer;
            this.appVer = gsonObj.appVer;
        }
        catch (JsonSyntaxException e){
            this.devType = 0;
            this.sysVer = null;
            this.appVer = null;
        }

    }

    public String convertToJson(){
        Gson gson = new Gson();
        String jsonString = gson.toJson(this);
        return jsonString;
    }


}
