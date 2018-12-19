package com.example.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author YaphetS
 * @date 2018/11/16
 */
@Data
public class ResultVO<T> {

    /** 错误码*/
    private Integer code;

    /** 信息*/
    private String msg;

    /** 返回数据*/
    private T data;
}
