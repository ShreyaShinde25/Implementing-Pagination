package com.example.pagination.repository;

import com.example.pagination.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long > {

    Page<User> findByNameContaining(String name, PageRequest pageable); //page and sort things
}
