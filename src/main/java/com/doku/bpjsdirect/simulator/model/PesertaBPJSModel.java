package com.doku.bpjsdirect.simulator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PesertaBPJSModel {

    @Column(name = "jmlkeluarga")
    private Integer jmlkeluarga;

    @Column(name = "nama")
    private String nama;
    
    @Column(name = "nmcabang")
    private String nmcabang;
    
    @Id
    @Column(name = "noka")
    private String noka;

    @Column(name = "nova")
    private String nova;

    public void setData(Integer jmlkeluarga, String nama, String nmcabang, String noka, String nova) {
        this.jmlkeluarga = jmlkeluarga;
        this.nama = nama;
        this.nmcabang = nmcabang;
        this.noka = noka;
        this.nova = nova;
    }
}