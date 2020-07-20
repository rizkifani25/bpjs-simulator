package com.doku.bpjsdirect.simulator.repository;

import com.doku.bpjsdirect.simulator.model.PesertaBPJSModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PesertaRepository extends JpaRepository<PesertaBPJSModel, String>{
    
    @Query(value = "SELECT * FROM peserta_bpjs WHERE noka = :noka", nativeQuery = true)
    PesertaBPJSModel getInfoByNoka (String noka);

}