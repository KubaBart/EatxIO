package com.example.eatx.cart;

import com.example.eatx.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Carts,Long> {
    public List<Carts> findByUser(User user);
}
