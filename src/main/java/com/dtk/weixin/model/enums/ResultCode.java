package com.dtk.weixin.model.enums;

/**
 * 
 * <p>Description: 支付返回值 </p>
 * @author wy
 * @date 2017年7月25日 下午4:03:20
 */
public enum ResultCode {
    SUCCESS("SUCCESS"), FAIL("FAIL");
    private String code;

    ResultCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
