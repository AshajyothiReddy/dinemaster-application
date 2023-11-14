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

import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;
import com.example.dinemaster.service.ChefJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ChefController {
    @Autowired
    public ChefJpaService chefJpaService;

    @GetMapping("/restaurants/{id}/chefs")
    public Restaurant getChefRestaurant(@PathVariable("id") int id){
        return chefJpaService.getChefRestaurant(id);
    }

    @GetMapping("/restaurants/chefs")
    public ArrayList<Chef> getChefs() {
        return chefJpaService.getChefs();
    }

    @PostMapping("/restaurants/chefs")
    public Chef addChef(@RequestBody Chef chef) {
        return chefJpaService.addChef(chef);
    }

    @GetMapping("/restaurants/chefs/{id}")
    public Chef getChef(@PathVariable("id") int id) {
        return chefJpaService.getChef(id);
    }

    @PutMapping("/restaurants/chefs/{id}")
    public Chef updateChef(@PathVariable("id") int id, @RequestBody Chef chef) {
        return chefJpaService.updateChef(id, chef);
    }

    @DeleteMapping("/restaurants/chefs/{id}")
    public void deleteChef(@PathVariable("id") int id) {
        chefJpaService.deleteChef(id);
    }
}