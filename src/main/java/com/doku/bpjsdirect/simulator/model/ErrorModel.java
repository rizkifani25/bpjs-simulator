package com.doku.bpjsdirect.simulator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ErrorModel {
    
    @Id
    @Column(name = "errorcode")
    private String errorcode;

    @Column(name = "errormessage")
    private String errormessage;

    public void setData(String code, String message) {
        this.errorcode = code;
        this.errormessage = message;
    }
}