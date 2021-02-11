package karbonfw.mtshex.store.dishes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Dish")
public class DishRecord {
  @Id private Long id;

  @Version
  @Column(name = "modificationcounter")
  private int modificationCounter;

  private String name;
  private String description;
  private BigDecimal price;

  @Column(name = "idimage")
  private Long imageId;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "dishingredient",
      joinColumns = {@JoinColumn(name = "iddish")},
      inverseJoinColumns = {@JoinColumn(name = "idingredient")})
  private List<IngredientRecord> extras;
}
