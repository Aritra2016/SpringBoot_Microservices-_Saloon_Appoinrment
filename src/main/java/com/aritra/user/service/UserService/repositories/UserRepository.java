package com.aritra.user.service.UserService.repositories;

import com.aritra.user.service.UserService.entities.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
