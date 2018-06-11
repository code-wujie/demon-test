package demon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WJ on 2018/6/11.
 */
@RestController
public class controller {

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloworld() {
        return "helloworld";
    }
}
