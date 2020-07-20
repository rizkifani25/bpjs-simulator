package com.doku.bpjsdirect.simulator.service;

import com.doku.bpjsdirect.simulator.model.BundleModel;
import com.doku.bpjsdirect.simulator.model.PesertaBPJSModel;
import com.doku.bpjsdirect.simulator.repository.PesertaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("rawtypes")
public class PesertaService {
    
    @Autowired
    PesertaRepository pesertaRepository;

    @Autowired
    ErrorHandler errorHandler;

    public BundleModel getInfoByNoka(String noka) {
        BundleModel bundleResponse = new BundleModel();
        PesertaBPJSModel pesertaBPJS = pesertaRepository.getInfoByNoka(noka);

        if(pesertaBPJS == null) {
            bundleResponse.setData(errorHandler.getError("204"), "");
            return bundleResponse;
        }
        
        pesertaBPJS.setData(pesertaBPJS.getJmlkeluarga(), pesertaBPJS.getNama(), pesertaBPJS.getNmcabang(), pesertaBPJS.getNoka(), pesertaBPJS.getNova());
        bundleResponse.setData(errorHandler.getError("1"), pesertaBPJS);

        return bundleResponse;
    }
}