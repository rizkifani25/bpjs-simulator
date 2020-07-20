package com.doku.bpjsdirect.simulator.controller;

import com.doku.bpjsdirect.simulator.model.BundleModel;
import com.doku.bpjsdirect.simulator.service.PesertaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("rawtypes")
@RequestMapping(value = "/InfoPesertaBPJS/{noka}")
public class PesertaBPJSController {
    
    @Autowired
    PesertaService pesertaService;

    @GetMapping
    public ResponseEntity<BundleModel> getController(@PathVariable("noka") String noka) {
        return new ResponseEntity<>(pesertaService.getInfoByNoka(noka), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> postController() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}