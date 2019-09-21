package java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("java.Test")
@RequestMapping("/yxd/test")
public class Test {
    @RequestMapping(value = "/index")
    public String index(){
        return "";
    }

}
