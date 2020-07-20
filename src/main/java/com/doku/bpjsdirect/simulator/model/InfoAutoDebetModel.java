package com.doku.bpjsdirect.simulator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class InfoAutoDebetModel {
    @Column(name = "idhead")
    private Integer idhead;

    @Column(name = "jmlkeluarga")
    private Integer jmlkeluarga;

    @Column(name = "kdasalpremi")
    private Integer kdasalpremi;

    @Column(name = "kdbank")
    private String kdbank;

    @Column(name = "nama")
    private String nama;

    @Column(name = "namapic")
    private String namapic;

    @Column(name = "nmbank")
    private String nmbank;

    @Column(name = "nmcabang")
    private String nmcabang;
    
    @Id
    @Column(name = "noka")
    private String noka;
    
    @Column(name = "nokapic")
    private String nokapic;

    @Column(name = "nokk")
    private String nokk;

    @Column(name = "norekening")
    private String norekening;

    @Column(name = "nova")
    private String nova;

    @Column(name = "premi")
    private Integer premi;

    @Column(name = "status_")
    private Integer status_;

    @Column(name = "tgl_input")
    private String tglInput;

    public void setData(
        Integer idhead, 
        Integer jmlkeluarga, 
        Integer kdasalpremi, 
        String kdbank, 
        String nama, 
        String namapic, 
        String nmbank, 
        String nmcabang, 
        String noka, 
        String nokapic, 
        String nokk, 
        String norekening, 
        String nova, 
        Integer premi, 
        Integer status_, 
        String tglInput){

        this.idhead = idhead;
        this.jmlkeluarga = jmlkeluarga;
        this.kdasalpremi = kdasalpremi;
        this.kdbank = kdbank;
        this.nama = nama;
        this.namapic = namapic;
        this.nmbank = nmbank;
        this.nmcabang = nmcabang;
        this.noka = noka;
        this.nokapic = nokapic;
        this.nokk = nokk;
        this.norekening = norekening;
        this.nova = nova;
        this.premi = premi;
        this.status_ = status_;
        this.tglInput = tglInput;
    }
}