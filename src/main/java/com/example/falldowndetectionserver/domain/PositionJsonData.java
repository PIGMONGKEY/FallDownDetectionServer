package com.example.falldowndetectionserver.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Data
public class PositionJsonData {
    private int min_X;
    private int min_y;
    private int max_x;
    private int max_y;
}