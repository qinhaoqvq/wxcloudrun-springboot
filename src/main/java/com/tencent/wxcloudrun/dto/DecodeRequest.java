package com.tencent.wxcloudrun.dto;

import lombok.Data;

/**
 * @Description:
 * @Created: 2022/5/4
 */
@Data
public class DecodeRequest {
    private String code;
    private String encryptedData;
    private String iv;
}
