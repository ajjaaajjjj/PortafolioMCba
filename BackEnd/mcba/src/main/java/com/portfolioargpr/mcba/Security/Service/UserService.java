package com.portfolioargpr.mcba.Security.Service;

import com.portfolioargpr.mcba.Security.Entity.User;
import com.portfolioargpr.mcba.Security.Repository.iUserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    iUserRepository iuserRepository;
    
    public Optional<User> getByUser(String username){
        return iuserRepository.findByUsername(username);
    }
    
    public boolean existsByUser(String username){
        return iuserRepository.existsByUser(username);
    }
    
    public boolean existsByEmail(String email){
        return iuserRepository.existsByEmail(email);
    }
    
    public void save(User user){
        iuserRepository.save(user);
    }
}
