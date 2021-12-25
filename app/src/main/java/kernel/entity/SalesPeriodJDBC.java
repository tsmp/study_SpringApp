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
}
