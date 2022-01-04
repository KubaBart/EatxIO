package com.example.eatx.products;

import com.example.eatx.restaurants.Restaurants;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="products")
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 50)
    private String name;

    @Column(nullable = false)
    private String price;

    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurants restaurants;



}