package com.bytes.allot.factory.serverInterfaceFactory;

import com.bytes.allot.factory.BytesBaseFactory;
import com.bytes.allot.serverInterface.RequestGetAllotModel;

/**
 * Created by PeterZhou on 15/6/6.
 */
public class BytesReqFactory extends BytesBaseFactory {
    public final static String GetAllot = "/allot";

    private RequestGetAllotModel reqModel = null;

    @Override
    public void Create(String productName, String productParam)
    {
        if (productName.equals(GetAllot))
        {
            RequestGetAllotModel model = new RequestGetAllotModel(productParam);
            this.reqModel = model;
        }
    }

    public RequestGetAllotModel getReqModel()
    {
        return this.reqModel;
    }
}
