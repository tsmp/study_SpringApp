package kernel.JDBC;

import kernel.entity.SalesPeriodJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesPeriodJDBCRepository
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int Count()
    {
        return jdbcTemplate.queryForObject("select count(*) from public.sales_period",Integer.class);
    }

    public List<SalesPeriodJDBC> getSalesPeriod()
    {
        return jdbcTemplate.query("select * from public.sales_period", (rs, rowNum) ->
                new SalesPeriodJDBC(
                        rs.getLong( "id"),
                        rs.getInt("price"),
                        rs.getDate("date_from"),
                        rs.getDate("date_to"),
                        rs.getInt("product")
                ));
    }
}
