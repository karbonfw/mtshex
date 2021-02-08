package karbonfw.mtshex.web;

import karbonfw.mtshex.domain.dishes.DishRepository;
import karbonfw.mtshex.store.dishes.DishDao;
import karbonfw.mtshex.store.dishes.DishJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class RepositoryConfiguration {

    private final DishDao dishDao;

    @Bean
    public DishRepository dishRepository() {
        return new DishJpaRepository(dishDao);
    }
}
