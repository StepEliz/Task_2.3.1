package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getString(@RequestParam(value = "count", defaultValue = "5") int count,
                            Model model) {
        CarServiceIml cars = new CarServiceIml();
        var carsData = cars.getCar(count);
        model.addAttribute("cars", carsData);
        return "cars";
    }
}
