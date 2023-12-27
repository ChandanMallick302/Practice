package com.springbootjpa.repositories;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
