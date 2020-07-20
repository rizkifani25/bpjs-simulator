package com.doku.bpjsdirect.simulator.repository;

import com.doku.bpjsdirect.simulator.model.InfoAutoDebetModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoAutoDebetRepository extends JpaRepository<InfoAutoDebetModel, String>{

    @Query(value = "SELECT * FROM info_autodebet WHERE noka = :noka", nativeQuery = true)
    InfoAutoDebetModel getInfoAutoDebetByNoka(String noka);

}