package com.demo.common.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RestReturnVO<T> extends ReturnVO{
    public RestReturnVO() {
    }

    @Getter
    @Setter
    private T data;

    public RestReturnVO(T data) {
        this(0,data);
    }

    public RestReturnVO(int code, T data) {
        super(code);
        this.data=data;
    }

    public RestReturnVO(int code, String msg, T data) {
        super(code,msg);
        this.data=data;
    }

}
