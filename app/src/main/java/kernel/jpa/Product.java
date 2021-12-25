package kernel.jpa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
@NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable
{
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    public Product(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
