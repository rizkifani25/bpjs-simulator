package com.doku.bpjsdirect.simulator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.doku.bpjsdirect.simulator.model.BundleModel;
import com.doku.bpjsdirect.simulator.model.DataAutoDebetModel;
import com.doku.bpjsdirect.simulator.service.AutoDebetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SuppressWarnings("rawtypes")
public class AutoDebetController {

    @Autowired
    AutoDebetService autoDebetService;

    @PostMapping(value = "/TambahDataAutoDebet")
    public ResponseEntity<BundleModel> postTambahDataAutoDebet(@RequestBody DataAutoDebetModel dataPeserta) {
        return new ResponseEntity<>(autoDebetService.insertNewDataAutoDebet(dataPeserta.getNoka(),
                dataPeserta.getHaridebet(), dataPeserta.getNorekening(), dataPeserta.getNamaonrekening(),
                dataPeserta.getNohp(), dataPeserta.getAlamatemail(), dataPeserta.getStatus_()), HttpStatus.OK);
    }

    @GetMapping(value = "/TambahDataAutoDebet")
    public ResponseEntity<String> getTambahDataAutoDebet() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping(value = "/UbahDataAutoDebet")
    public ResponseEntity<BundleModel> postUbahDataAutoDebet(@RequestBody DataAutoDebetModel dataPeserta) {
        return new ResponseEntity<>(autoDebetService.editDataAutoDebet(dataPeserta.getNoka(),
                dataPeserta.getHaridebet(), dataPeserta.getNorekening(), dataPeserta.getNamaonrekening(),
                dataPeserta.getNohp(), dataPeserta.getAlamatemail(), dataPeserta.getStatus_()), HttpStatus.OK);
    }

    @GetMapping(value = "/UbahDataAutoDebet")
    public ResponseEntity<String> getUbahDataAutoDebet() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping(value = "/InfoPesertaAutoDebet/{noka}")
    public ResponseEntity<BundleModel> postInfoPesertaAutoDebet(@PathVariable("noka") String noka) {
        return new ResponseEntity<>(autoDebetService.getInfoAutoDebetByNoka(noka), HttpStatus.OK);
    }

    @GetMapping(value = "/InfoPesertaAutoDebet/{noka}")
    public ResponseEntity<String> getInfoPesertaAutoDebet(@PathVariable("noka") String noka) {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/DataAutoDebet")
    public ResponseEntity<BundleModel> listDataAutoDebet() {
        return new ResponseEntity<>(autoDebetService.listDataAutoDebet(), HttpStatus.OK);
    }

}