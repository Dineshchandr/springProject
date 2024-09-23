package springioc.demo.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springioc.demo.Service.ServiceApi;
import springioc.demo.Service.ServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionTest {

    PropertyInjection injection;
    @BeforeEach
    void setUp() {
        injection=new PropertyInjection();
        injection.api=new ServiceImpl();
    }

    @Test
    void demo() {
        System.out.println(injection.demo());
    }
}