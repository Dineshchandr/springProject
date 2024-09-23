package springioc.demo.Controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String myOjb(){

        System.out.println("demostep");
        return "The step 1";

    }
}
