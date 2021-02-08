package karbonfw.mtshex.web.rest;

import karbonfw.mtshex.app.dishes.DishFacade;
import karbonfw.mtshex.domain.dishes.Dish;
import karbonfw.mtshex.domain.dishes.DishId;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class DishController {

    private final DishFacade dishFacade;

    @GetMapping("/dishmanagement/v1/dish/{id}")
    public ResponseEntity<Dish> getDish(@PathVariable long id) {
        return ResponseEntity.of(dishFacade.findById(new DishId(id, -1)));
    }
}
