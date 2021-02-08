package karbonfw.mtshex.domain.dishes;

import lombok.Data;

@Data
public class DishId {
    private final long id;
    private final int modificationCounter;
}
