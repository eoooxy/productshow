package com.ahoo.dto;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/1/22 0022
 * Time: 22:24
 */

public class MessageDto {

    //返回代码 1为成功 0为失败
    private String code;
    //返回的提示消息
    private String ctx;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCtx() {
        return ctx;
    }

    public void setCtx(String ctx) {
        this.ctx = ctx;
    }
}
