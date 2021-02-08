package karbonfw.mtshex.store.dishes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Ingredient")
public class IngredientRecord {
    @Id
    private Long id;
    @Version
    @Column(name = "modificationcounter")
    private int modificationCounter;
    private String name;
    private String description;
    private BigDecimal price;
}
