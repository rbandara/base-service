package foo.bar.repo;

import foo.bar.model.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<UserAccount, Long> {
    UserAccount findByClientId(Long clientId);
}
