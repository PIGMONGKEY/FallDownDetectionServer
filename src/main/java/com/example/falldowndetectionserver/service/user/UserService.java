package com.example.falldowndetectionserver.service.user;

import com.example.falldowndetectionserver.domain.dto.user.SignUpRequestDTO;
import com.example.falldowndetectionserver.domain.dto.UserDTO;
import com.example.falldowndetectionserver.domain.dto.BasicResponseDTO;

public interface UserService {
    public BasicResponseDTO checkCameraId(String cameraId);
    public BasicResponseDTO signup(SignUpRequestDTO signUpRequestDTO);
    public UserDTO getUserInfo(String cameraId);
    public BasicResponseDTO removeUserInfo(String cameraId);
    public String modifyUserInfo(UserDTO userDTO);
}
