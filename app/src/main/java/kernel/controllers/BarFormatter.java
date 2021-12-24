package kernel.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("BarFormatter")
public class BarFormatter implements IFormatter
{
    @Override
    public String Format()
    {
        return "BarFormatter";
    }
}
