package com.example.falldowndetectionserver.mapper;

import com.example.falldowndetectionserver.domain.NokPhoneVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface NokPhoneMapper {
    public void insert(NokPhoneVO nokPhoneVO);
    public void delete(String cameraId);
    public List<String> selectAll(String cameraId);
}
