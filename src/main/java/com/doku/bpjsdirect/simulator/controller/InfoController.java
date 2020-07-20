package com.doku.bpjsdirect.simulator.controller;

import com.doku.bpjsdirect.simulator.service.ErrorHandler;
import com.doku.bpjsdirect.simulator.model.BundleModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("rawtypes")
@RequestMapping(value = "/Inforesponse")
public class InfoController {
    
    @Autowired
    ErrorHandler errorHandler;

    @GetMapping
    public ResponseEntity<BundleModel> getController() {
        return new ResponseEntity<>(errorHandler.getListError(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> postController() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}