package com.brickpointit.securecapita.service.implementation;

import org.springframework.stereotype.Service;

import com.brickpointit.securecapita.domain.User;
import com.brickpointit.securecapita.dto.UserDTO;
import com.brickpointit.securecapita.dtomapper.UserDTOMapper;
import com.brickpointit.securecapita.repository.UserRepository;
import com.brickpointit.securecapita.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUSer(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}
