package com.example.falldowndetectionserver.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class NokPhoneVO {
    private String cameraId;
    private String nokPhone;
}