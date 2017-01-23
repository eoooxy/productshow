package com.ahoo.dto;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/1/22 0022
 * Time: 22:24
 */

public class MessageDto {

    //返回代码 1为成功 0为失败
    private String MessageCode;
    //返回的提示消息
    private String MessageCtx;

    public String getMessageCode() {
        return MessageCode;
    }

    public void setMessageCode(String messageCode) {
        MessageCode = messageCode;
    }

    public String getMessageCtx() {
        return MessageCtx;
    }

    public void setMessageCtx(String messageCtx) {
        MessageCtx = messageCtx;
    }
}
