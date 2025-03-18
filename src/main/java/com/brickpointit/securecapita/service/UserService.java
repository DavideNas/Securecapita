package com.brickpointit.securecapita.service;

import com.brickpointit.securecapita.domain.User;
import com.brickpointit.securecapita.dto.UserDTO;

public interface UserService {
    UserDTO createUSer(User user);
}
