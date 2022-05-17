package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getCarsCount(5));
        } else {
            model.addAttribute("cars", carService.getCarsCount(count));
        }
        return "cars";
    }
}