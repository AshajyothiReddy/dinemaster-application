/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;
import com.example.dinemaster.model.Restaurant;

import java.util.*;

public interface RestaurantRepository{
    ArrayList<Restaurant> getRestaurants();
    Restaurant addRestaurant(Restaurant restaurant);
    Restaurant getRestaurant(int id);
    Restaurant updateRestaurant(int id, Restaurant restaurant);
    void deleteRestaurant(int id);
}