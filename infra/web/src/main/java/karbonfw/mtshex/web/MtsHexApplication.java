package karbonfw.mtshex.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "karbonfw.mtshex.store")
@EnableJpaRepositories(basePackages = "karbonfw.mtshex.store")
public class MtsHexApplication {
  public static void main(String[] args) {
    SpringApplication.run(MtsHexApplication.class, args);
  }
}
