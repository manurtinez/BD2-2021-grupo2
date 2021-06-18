package bd2.repositories.spring;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import bd2.model.User;

public interface UserRepository extends CrudRepository<User, UUID> {

  User findByEmail(String email);

}
