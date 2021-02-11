package karbonfw.mtshex.web;

import karbonfw.mtshex.domain.dishes.DishRepository;
import karbonfw.mtshex.store.dishes.DishDao;
import karbonfw.mtshex.store.dishes.DishJpaRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
public class RepositoryConfiguration {

  private final DishDao dishDao;

  @Bean
  public DishRepository dishRepository() {
    return new DishJpaRepository(dishDao);
  }
}
