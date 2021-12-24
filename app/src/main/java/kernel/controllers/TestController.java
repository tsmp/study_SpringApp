package kernel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class TestController
{
    @Qualifier("FooFormatter")
    @Autowired()
    private IFormatter m_Formatter;

    @GetMapping("/hello")
    public String getHello()
    {
        return "Hello world! 123";
    }

    @GetMapping("/format")
    public String getFormat()
    {
        return m_Formatter.Format();
    }
}
