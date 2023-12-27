package com.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
