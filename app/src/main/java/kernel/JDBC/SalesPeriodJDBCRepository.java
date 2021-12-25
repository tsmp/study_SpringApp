package kernel.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SalesPeriodJDBCRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int Count()
    {
        return jdbcTemplate.queryForObject("select count(*) from public.sales_period",Integer.class);
    }
}
