package web.controller;
import web.CarService;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

