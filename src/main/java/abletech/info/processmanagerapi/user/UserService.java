package abletech.info.processmanagerapi.user;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import abletech.info.processmanagerapi.user.model.User;

@Service
public class UserService {

    private final transient UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(String id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public User findById(ObjectId id) {
        return this.userRepository.findById(id.toHexString()).orElse(null);
    }
}
