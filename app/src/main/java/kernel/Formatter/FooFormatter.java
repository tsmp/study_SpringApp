package kernel.Formatter;

import org.springframework.stereotype.Component;

@Component("FooFormatter")
public class FooFormatter implements IFormatter
{
    @Override
    public String Format()
    {
        return "FooFormatter";
    }
}
