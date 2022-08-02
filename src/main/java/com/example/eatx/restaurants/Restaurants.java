package com.example.eatx.restaurants;

import com.example.eatx.products.Products;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="restaurants")
@Getter
@Setter
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 50)
    private String name;

    @OneToMany(mappedBy = "restaurants")
    private List <Products> products;


}
