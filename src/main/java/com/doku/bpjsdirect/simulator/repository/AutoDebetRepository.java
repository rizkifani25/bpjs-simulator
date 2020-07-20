package com.doku.bpjsdirect.simulator.repository;

import java.util.List;

import com.doku.bpjsdirect.simulator.model.DataAutoDebetModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AutoDebetRepository extends JpaRepository<DataAutoDebetModel, String>{
    
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO data_autodebet(noka, haridebet, norekening, namaonrekening, nohp, alamatemail, status_) VALUES (:noka, :haridebet, :norekening, :namaonrekening, :nohp, :alamatemail, :status_);", nativeQuery = true)
    void insertNewDataAutoDebet(String noka, Integer haridebet, String norekening, String namaonrekening, String nohp, String alamatemail, Integer status_);

    @Transactional
    @Modifying
    @Query(value = "UPDATE data_autodebet SET noka = :noka, haridebet = :haridebet, norekening = :norekening, namaonrekening = :namaonrekening, nohp = :nohp, alamatemail = :alamatemail, status_ = :status_ WHERE noka = :noka", nativeQuery = true)
    void editDataAutoDebet(String noka, Integer haridebet, String norekening, String namaonrekening, String nohp, String alamatemail, Integer status_);

    @Query(value = "SELECT * FROM data_autodebet", nativeQuery = true)
    List<DataAutoDebetModel> getListDataAutoDebet();

}