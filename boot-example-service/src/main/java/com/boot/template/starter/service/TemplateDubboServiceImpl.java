package com.boot.template.starter.service;

import com.boot.template.starter.remote.TemplateDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TemplateDubboServiceImpl implements TemplateDubboService {
    @Override
    public String add(int a, int b) {
        return String.valueOf(a + b);
    }
}
