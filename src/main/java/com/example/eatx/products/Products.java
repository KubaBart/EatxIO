package com.example.eatx.products;

import com.example.eatx.restaurants.Restaurants;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="products")
@Getter
@Setter
@EqualsAndHashCode
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 50)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurants restaurants;


}