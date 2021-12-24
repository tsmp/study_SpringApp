package kernel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController
{
    @GetMapping("/hello")
    public String getHello()
    {
        return "Hello world! 123";
    }
}
