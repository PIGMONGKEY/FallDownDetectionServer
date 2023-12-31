package com.example.falldowndetectionserver.domain.dto.aligo;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Aligo 문자전송 시스템에 SMS 전송 요청 DTO
 */
@Data
@Builder
public class AligoSendSMSRequestDTO {
    private String key;
    private String user_id;
    private String sender;
    private String receiver;
    private String msg;
    private String msg_type;
    private String testmode_yn;   // Y or null
}
