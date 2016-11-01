package foo.bar.svc;

import foo.bar.svc.pojo.Response;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    public Response getData(Long ccsId) {
        return new Response(ccsId, "Hello!, Your message received ");
    }
}
