package com.demo.common.vo;

import java.time.Instant;

/**
 * 返回实体
 * @author JFeng
 */
public class ReturnVO {
    public ReturnVO() {
    }
    public ReturnVO(int code) {
        this(code, "Success");
    }

    public ReturnVO(int code,String msg) {
        this.code = code;
        this.time = Instant.now().getEpochSecond();
        this.msg = msg;
    }

    /**
     * 	接口状态（0:正常）
     */
    private int code;

    /**
     * 服务器时间 单位:秒
     */
    private long time;

    /**
     * 接口错误信息(用于前端提示)
     */
    private String msg;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取错误返回
     * @param code
     * @return
     */
    public static ReturnVO genReturn(int code){
        return new ReturnVO(code);
    }

    /**
     * 获取错误返回
     * @param code
     * @return
     */
    public static ReturnVO genErrorReturn(int code,String msg){
        return new ReturnVO(code,msg);
    }

    /**
     * 获取正确返回
     * @return
     */
    public static ReturnVO genSuccessReturn(){
        return genReturn(0);
    }

    @Override
    public String toString() {
        return "ReturnVO{" +
                "code=" + code +
                ", time=" + time +
                ", msg='" + msg + '\'' +
                '}';
    }
}
