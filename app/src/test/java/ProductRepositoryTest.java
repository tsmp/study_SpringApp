import kernel.entity.Product;
import kernel.jpa.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
@Sql({"/schema.sql", "/data.sql"})
public class ProductRepositoryTest
{
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void findAllTest()
    {
        List<Product> productList = productRepository.findAll();
        Assert.assertEquals(productList.size(),2);
    }
}
