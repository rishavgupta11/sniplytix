package com.url.shortner.snipLytix.repository;

import com.url.shortner.snipLytix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String user);
    Optional<User> findByEmail(String email);
}
