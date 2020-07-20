package com.doku.bpjsdirect.simulator.repository;

import java.util.List;

import com.doku.bpjsdirect.simulator.model.ErrorModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorRepository extends JpaRepository<ErrorModel, String> {

    @Query(value = "SELECT * FROM error_handler", nativeQuery = true)
    List<ErrorModel> getListErrorCode();

    @Query(value = "SELECT * FROM error_handler WHERE errorcode = :code", nativeQuery = true)
    ErrorModel getErrorByCode(String code);

}