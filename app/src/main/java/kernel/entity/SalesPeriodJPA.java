package kernel.entity;

import kernel.jpa.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales_period")
@NoArgsConstructor
@Getter
@Setter
public class SalesPeriodJPA
{
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sales_periods_id_seq")
    @SequenceGenerator(name = "sales_periods_id_seq",sequenceName = "sales_periods_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "price")
    private long price;

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_to")
    private Date dateTo;

    @OneToOne
    @JoinColumn(name = "product",referencedColumnName = "id",nullable = false)
    private Product product;
}
