package com.dtk.weixin.service;

/**
 * 
 * <p>Description: 参数校验接口 </p>
 * @author wy
 * @date 2017年7月25日 下午4:12:37
 */
public interface Validator {
    String getField();

    boolean isRequired();
}
