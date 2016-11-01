package foo.bar.repo;

import foo.bar.model.UserAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("scratch")
public class RepositoryTest {

    @Autowired
    private DataRepository dataRepository;

    @Test
    public void queryById_ValidId_ShouldReturnData() {
        Long clientId = 12L;
        UserAccount userAccount = dataRepository.findByClientId(clientId);
        assertNotNull(userAccount);
    }
}
