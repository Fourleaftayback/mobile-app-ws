package com.appdeveloperblog.app.ws.mobileappws.io.repository;

import com.appdeveloperblog.app.ws.mobileappws.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
