package com.example.sell.VO.enums;

import lombok.Getter;

/**
 * @author YaphetS
 * @date 2018/11/16
 */
@Getter
public enum ResultVOCodesEnum {
    SUCCESS(0)
    ;

    private Integer code;

    ResultVOCodesEnum(Integer code) {
        this.code = code;
    }
}
