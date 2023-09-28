package com.example.falldowndetectionserver.dao;

import com.example.falldowndetectionserver.domain.NokPhoneVO;
import com.example.falldowndetectionserver.mapper.NokPhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
@RequiredArgsConstructor
public class NokPhoneDao {
    private final NokPhoneMapper nokPhoneMapper;

    public void insert(NokPhoneVO nokPhoneVO) {
        nokPhoneMapper.insert(nokPhoneVO);
    }

    public void delete(String cameraId) {
        nokPhoneMapper.delete(cameraId);
    }

    public List<String> selectAll(String cameraId) {
        return nokPhoneMapper.selectAll(cameraId);
    }
}