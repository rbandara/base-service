package foo.bar.svc;

import foo.bar.BaseServiceMain;
import foo.bar.svc.pojo.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseServiceMain.class)
@ActiveProfiles("scratch")
public class ServiceTest {

    @Autowired
    private BaseService baseService;

    @Test
    public void getData_ValidInput_ValidOutput() {
        Long validId = 2342L;
        Response response = baseService.getData(validId);
        assertNotNull(response);
    }
}
