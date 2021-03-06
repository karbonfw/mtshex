package karbonfw.mtshex.web;

import karbonfw.mtshex.app.dishes.DishFacade;
import karbonfw.mtshex.domain.dishes.DishRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
public class FacadeConfiguration {

  private final DishRepository dishRepository;

  @Bean
  public DishFacade dishFacade() {
    // TODO pass DishQuery
    return new DishFacade(new DummySecurityGuard(), dishRepository, null);
  }
}
