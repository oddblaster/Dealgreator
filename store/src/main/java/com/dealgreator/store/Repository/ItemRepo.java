package com.dealgreator.store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dealgreator.store.Entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}
