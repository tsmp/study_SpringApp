package kernel.controllers;

import kernel.Formatter.IFormatter;
import kernel.JDBC.SalesPeriodJDBCRepository;
import kernel.entity.SalesPeriodJDBC;
import kernel.jpa.Product;
import kernel.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TestController
{
    @Autowired()
    private IFormatter m_Formatter;

    @Autowired
    private SalesPeriodJDBCRepository salesPeriodJDBCRepository;

    @Autowired()
    private ProductRepository productRepository;

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

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return productRepository.findAll();
    }

    @GetMapping("/sales/count")
    public Integer getSalesCount()
    {
        return salesPeriodJDBCRepository.Count();
    }

    @GetMapping("/sales")
    public List<SalesPeriodJDBC> getSales()
    {
        return salesPeriodJDBCRepository.getSalesPeriod();
    }
}
