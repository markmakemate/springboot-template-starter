package com.boot.template.starter.response;

import com.boot.template.starter.enums.HttpCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {

    private HttpCode code;

    private String message;
}
