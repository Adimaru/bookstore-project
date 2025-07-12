package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.model.Order;
import com.bookstore.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByUser(User user);
    Optional<Order> findByIdAndUser(Long id, User user);
}