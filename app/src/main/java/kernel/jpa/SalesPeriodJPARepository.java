package kernel.jpa;

import kernel.entity.SalesPeriodJPA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface SalesPeriodJPARepository extends JpaRepository<SalesPeriodJPA, Long>
{
    @Query(value = "select max(price) from sales_period where product = :productId",nativeQuery = true)
    Integer getMaxPriceByProductId(@Param("productId") long productId);

    boolean existsByPrice(long price);

    List<SalesPeriodJPA> findByDateToIsNull();

    List<SalesPeriodJPA> findByProductName(String productName);
}
