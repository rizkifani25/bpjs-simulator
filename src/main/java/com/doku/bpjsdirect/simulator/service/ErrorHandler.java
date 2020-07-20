package com.doku.bpjsdirect.simulator.service;

import com.doku.bpjsdirect.simulator.model.BundleModel;
import com.doku.bpjsdirect.simulator.model.ErrorModel;
import com.doku.bpjsdirect.simulator.repository.ErrorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("rawtypes")
public class ErrorHandler {
    
    @Autowired
    ErrorRepository errorRepository;

    public BundleModel getListError() {
        BundleModel bundleResponse = new BundleModel();

        bundleResponse.setData(getError("1"), errorRepository.getListErrorCode());

        return bundleResponse;
    }

    public ErrorModel getError(String errcode) {
        return errorRepository.getErrorByCode(errcode);
    }

}