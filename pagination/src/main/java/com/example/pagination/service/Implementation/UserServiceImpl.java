package com.example.pagination.service.Implementation;


import com.example.pagination.domain.User;
import com.example.pagination.repository.UserRepository;
import com.example.pagination.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j //log some things as requests are coming in

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("fetching users for page{} of size{}", page, size);
        return userRepository.findByNameContaining(name, PageRequest.of(page, size));
    }
}
