package kernel.controllers;

import kernel.Formatter.IFormatter;
import kernel.JDBC.SalesPeriodJDBCRepository;
import kernel.entity.SalesPeriodJDBC;
import kernel.entity.SalesPeriodJPA;
import kernel.jpa.Product;
import kernel.jpa.ProductRepository;
import kernel.jpa.SalesPeriodJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TestController
{
    @Autowired()
    private IFormatter m_Formatter;

    @Autowired
    private SalesPeriodJDBCRepository salesPeriodJDBCRepository;

    @Autowired
    private SalesPeriodJPARepository salesPeriodJPARepository;

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

    @GetMapping("/sales/higherprice")
    public List<SalesPeriodJDBC> getSalesPeriodHigherPrice()
    {
        return salesPeriodJDBCRepository.getSalesPeriodPriceIsHigher(90);
    }

    @GetMapping("/products/salesactive")
    public List<Product> getProductWithActivePeriod()
    {
        return salesPeriodJDBCRepository.getProductWithActivePeriod();
    }

    @GetMapping("/salesjpa")
    public List<SalesPeriodJPA> getSalesPeriodJpa()
    {
        return salesPeriodJPARepository.findAll();
    }

    @PostMapping("/salesjpa")
    public void addSalesPeriodJpa(@RequestBody SalesPeriodJPA salesPeriodJPA)
    {
        salesPeriodJPARepository.save(salesPeriodJPA);
    }

    @GetMapping("/maxpricejpa")
    public Integer getMaxPriceByProductId()
    {
        return salesPeriodJPARepository.getMaxPriceByProductId(2);
    }

    @GetMapping("/bypricejpa")
    public boolean getExistsByPrice()
    {
        return salesPeriodJPARepository.existsByPrice(150);
    }

    @GetMapping("/activejpa")
    public List<SalesPeriodJPA> getDateToIsNull()
    {
        List<SalesPeriodJPA> lst = salesPeriodJPARepository.findByDateToIsNull();
        return lst;
    }

    @GetMapping("/getbynamejpa")
    public List<SalesPeriodJPA> getByProductName()
    {
        List<SalesPeriodJPA> lst = salesPeriodJPARepository.findByProductName("bike");
        return lst;
    }
}
