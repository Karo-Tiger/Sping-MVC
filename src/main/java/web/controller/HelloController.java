package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carcc.CarService;
import web.carcc.CarServiceImpl;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private CarServiceImpl carService;


    @GetMapping("/cars")
    public String showCars(@RequestParam(defaultValue = "", required = false) String count, Model model) {
        List<web.model.Car> cars;
        try {
            int requestedCount = Integer.parseInt(count);
            cars = carService.getCars(requestedCount);
        } catch (NumberFormatException | NullPointerException e) {
            cars = carService.getAllCars(); // если count не число или пусто, возвращаем все машины
        }
        model.addAttribute("cars", cars);
        return "car";
    }
}