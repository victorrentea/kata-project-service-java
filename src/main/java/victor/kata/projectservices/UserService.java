package victor.kata.projectservices;

import java.util.Optional;

public interface UserService {
   Optional<User> findByUuid(String cuid);
}
