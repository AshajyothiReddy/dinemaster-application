/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import java.util.*;

import com.example.dinemaster.model.Chef;
import com.example.dinemaster.model.Restaurant;

public interface ChefRepository {
    Restaurant getChefRestaurant(int id);

    ArrayList<Chef> getChefs();

    Chef addChef(Chef chef);

    Chef getChef(int id);

    Chef updateChef(int id, Chef chef);

    void deleteChef(int id);
}