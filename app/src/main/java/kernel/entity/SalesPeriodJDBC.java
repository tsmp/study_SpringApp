package kernel.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SalesPeriodJDBC
{
    private long id;
    private long price;
    private Date dateFrom;
    private Date dateTO;
    private Integer product;

    public SalesPeriodJDBC(long id, long price, Date dateFrom, Date dateTO, Integer product)
    {
        this.id = id;
        this.price = price;
        this.dateFrom = dateFrom;
        this.dateTO = dateTO;
        this.product = product;
    }
}
