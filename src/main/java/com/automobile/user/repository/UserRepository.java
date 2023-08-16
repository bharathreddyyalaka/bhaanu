package com.automobile.user.repository;

import com.automobile.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends  JpaRepository<UserModel, Integer> {


}
