package by.abelski.boxagent.persistance;

import by.abelski.boxagent.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User,String> {
    User findByUsername(String username);
}
