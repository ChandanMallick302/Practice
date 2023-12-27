package com.springbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.entities.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
