package com.example.eatx.restaurants;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RestarutantsService {

    @Autowired
    private RestaurantsRepository repo;
    public List<Restaurants> listAll()
    {
        return (List<Restaurants>) repo.findAll();
    }

    public Restaurants get(Long id) throws RestaurantsNotFoundException
    {
     Optional<Restaurants> result = repo.findById(id);
     if(result.isPresent())
     {
         return result.get();
     } throw new RestaurantsNotFoundException();

    }
}
