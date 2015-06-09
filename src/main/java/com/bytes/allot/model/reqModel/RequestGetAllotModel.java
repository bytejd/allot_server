package com.bytes.allot.model.reqModel;

import com.google.gson.Gson;

/**
 * Created by PeterZhou on 15/6/4.
 * interface:getAllotServer
 19 |method         |param      |paramDesc          |required
 20 |getServer      |uid        |required           |true
 21 |               |serverType |int serverTypeID   |true
 22 |               |devType    |int 0:ios 1:android|true
 23 |               |sysVer     |string             |true
 24 |               |devKey     |string             |true
 25 |               |appVer     |string             |true
 */


public class RequestGetAllotModel extends RequestBaseModel{
    private Long uid;
    private int serverType;

    RequestGetAllotModel(int mServerType, int mDevType, String mSysType, String mAppVer) {
        super(mDevType, mSysType, mAppVer);
        this.serverType = mServerType;
    }

    public RequestGetAllotModel(String mJsonStr) {
        super(mJsonStr);
        Gson gson = new Gson();
        RequestGetAllotModel m = gson.fromJson(mJsonStr,RequestGetAllotModel.class);
        this.uid = m.uid;
        this.serverType = m.serverType;
    }
}
