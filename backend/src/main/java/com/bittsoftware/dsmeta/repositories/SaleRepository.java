package com.bittsoftware.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bittsoftware.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
