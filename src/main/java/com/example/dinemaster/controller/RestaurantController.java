/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.controller;

import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.service.RestaurantJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class RestaurantController {
    @Autowired
    public RestaurantJpaService restaurantJpaService;

    @GetMapping("/restaurants")
    public ArrayList<Restaurant> getRestaurants() {
        return restaurantJpaService.getRestaurants();
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantJpaService.addRestaurant(restaurant);
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant getrestaurant(@PathVariable("id") int id){
        return restaurantJpaService.getRestaurant(id);
    }

    @PutMapping("/restaurants/{id}")
    public Restaurant updateRestaurant(@PathVariable("id") int id, @RequestBody Restaurant restaurant){
        return restaurantJpaService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable("id") int id){
        restaurantJpaService.deleteRestaurant(id);
    }
}