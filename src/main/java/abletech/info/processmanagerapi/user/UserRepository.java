package abletech.info.processmanagerapi.user;

import abletech.info.processmanagerapi.user.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
