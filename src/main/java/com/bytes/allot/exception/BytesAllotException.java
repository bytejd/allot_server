package com.bytes.allot.exception;

/**
 * Created by PeterZhou on 15/6/9.
 */
public class BytesAllotException extends Exception{
    public BytesAllotException(){

    }

    public BytesAllotException(String msg){
        super(msg);
    }

    public BytesAllotException(String msg, Throwable throwable){
        super(msg,throwable);
    }
}
