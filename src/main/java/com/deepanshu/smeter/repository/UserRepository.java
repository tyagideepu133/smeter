package com.deepanshu.smeter.repository;

import com.deepanshu.smeter.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
