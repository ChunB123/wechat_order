package com.example.sell.utils;

import com.example.sell.VO.ResultVO;
import com.example.sell.VO.enums.ResultVOCodesEnum;
import com.example.sell.VO.enums.ResultVOMsgsEnum;

/**
 * @author YaphetS
 * @date 2018/11/16
 */
public class ResultVOUtil {
    public static ResultVO success(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setData(data);
        resultVO.setCode(ResultVOCodesEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultVOMsgsEnum.SUCCESS.getMsg());
        return resultVO;
    }
}
