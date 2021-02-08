package karbonfw.mtshex.domain.dishes;

public interface DishRepository {
    Dish findById(DishId id);
}
