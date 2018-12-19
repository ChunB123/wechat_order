package com.example.sell.VO.enums;

import lombok.Getter;

/**
 * @author YaphetS
 * @date 2018/11/16
 */
@Getter
public enum ResultVOMsgsEnum {
    SUCCESS("成功")
    ;
    private String msg;

    ResultVOMsgsEnum(String msg) {
        this.msg = msg;
    }
}
