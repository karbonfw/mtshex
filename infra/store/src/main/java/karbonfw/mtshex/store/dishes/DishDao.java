package karbonfw.mtshex.store.dishes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DishDao extends JpaRepository<DishRecord, Long> {
}
