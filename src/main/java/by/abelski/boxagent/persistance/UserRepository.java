package by.abelski.boxagent.persistance;

import by.abelski.boxagent.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  {
    User findByUsername(String username);
}
