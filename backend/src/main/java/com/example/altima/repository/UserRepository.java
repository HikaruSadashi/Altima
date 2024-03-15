package com.example.altima.repository;

import com.example.altima.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optisonal;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    List<User> findByEmail(String email);

    List<User> findByAgeGreaterThan(int age);

    List<User> findByRole(String role);

    List<User> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);

    long countByStatus(String status);
}

