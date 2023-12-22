package com.Eblogger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Eblogger.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>  {

}
