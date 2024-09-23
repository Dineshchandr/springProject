package springioc.demo.Controller;

import springioc.demo.Service.ServiceApi;

import java.io.Serial;

public class PropertyInjection {
      ServiceApi api;

    public String demo(){
        return api.getOjbDi();
    }


}
