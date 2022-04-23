package com.idat.idatapirest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatapirest.demo.model.Clients;

@Repository
public interface ClienteRepository extends JpaRepository<Clients, Integer>{

}
