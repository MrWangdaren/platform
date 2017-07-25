package com.dtk.weixin.wxutils;

import java.util.Map;

import com.dtk.weixin.service.Validator;

/**
 * 
 * <p>Description: 参数校验工具 </p>
 * @author wy
 * @date 2017年7月25日 下午4:23:08
 */
public class ValidateUtil {
    public static void validate(Validator[] values, Map<String, Object> data) {
        for (Validator v : values) {
            if (v.isRequired()) {
                if (data.get(v.getField()) == null) {
                    throw new IllegalArgumentException(v.getField() + "不能为空");
                }
            }
        }
    }
}
