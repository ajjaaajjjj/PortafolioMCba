package com.portfolioargpr.mcba.Security.Repository;

import com.portfolioargpr.mcba.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUsername(String username);
    
    boolean existsByUser(String username);
    boolean existsByEmail(String email);
}
