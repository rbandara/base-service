package foo.bar.svc;

import foo.bar.svc.pojo.Request;
import foo.bar.svc.pojo.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@Api(value = "Base controller ", description = "Contains operations to get data")
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ApiOperation(value = "Returns data")
    public ResponseEntity<Response> getAccountDetails(
            HttpServletRequest request,
            @RequestParam Long id) {

        HttpSession session = request.getSession(true);

        if (null == session )
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        logger.info("request received from client id " + id);
        Response response = baseService.getData(id);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
