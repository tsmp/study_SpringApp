import kernel.entity.Product;
import kernel.jpa.ProductRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

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
        Assert.assertEquals(productList.size(),3);
    }

    @Before
    public void createProductTest()
    {
        Product product = new Product(3,"productTest");
        productRepository.save(product);

        Optional<Product> optionalProduct = productRepository.findById(3);
        Assert.assertTrue(optionalProduct.isPresent());
    }
}
