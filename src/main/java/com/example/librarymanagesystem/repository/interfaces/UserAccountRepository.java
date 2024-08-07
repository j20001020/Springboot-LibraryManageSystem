package com.example.librarymanagesystem.repository.interfaces;

import com.example.librarymanagesystem.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
    UserAccount findByUsername(String username);
}
