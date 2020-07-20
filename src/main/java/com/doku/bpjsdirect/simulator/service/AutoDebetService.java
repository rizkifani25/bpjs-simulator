package com.doku.bpjsdirect.simulator.service;

import java.util.List;

import com.doku.bpjsdirect.simulator.model.BundleModel;
import com.doku.bpjsdirect.simulator.model.DataAutoDebetModel;
import com.doku.bpjsdirect.simulator.model.InfoAutoDebetModel;
import com.doku.bpjsdirect.simulator.repository.AutoDebetRepository;
import com.doku.bpjsdirect.simulator.repository.InfoAutoDebetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("rawtypes")
public class AutoDebetService {
    
    @Autowired
    AutoDebetRepository autoDebetRepository;

    @Autowired
    InfoAutoDebetRepository infoAutoDebetRepository;

    @Autowired
    ErrorHandler errorHandler;

    public BundleModel insertNewDataAutoDebet(String noka, Integer haridebet, String norekening, String namaonrekening, String nohp, String alamatemail, Integer status_) {
        BundleModel bundleResponse = new BundleModel();
        
        autoDebetRepository.insertNewDataAutoDebet(noka, haridebet, norekening, namaonrekening, nohp, alamatemail, status_);

        bundleResponse.setData(errorHandler.getError("1"), "");

        return bundleResponse;
    }

    public BundleModel editDataAutoDebet(String noka, Integer haridebet, String norekening, String namaonrekening, String nohp, String alamatemail, Integer status_) {
        BundleModel bundleResponse = new BundleModel();
      
        autoDebetRepository.editDataAutoDebet(noka, haridebet, norekening, namaonrekening, nohp, alamatemail, status_);
        
        bundleResponse.setData(errorHandler.getError("1"), "");

        return bundleResponse;
    }

    public BundleModel listDataAutoDebet() {
        BundleModel bundleResponse = new BundleModel();
        List<DataAutoDebetModel> listData;
        
        listData = autoDebetRepository.getListDataAutoDebet();
        bundleResponse.setData(errorHandler.getError("1"), listData);
        
        return bundleResponse;
    }

    public BundleModel getInfoAutoDebetByNoka(String noka) {
        BundleModel bundleResponse = new BundleModel();
        InfoAutoDebetModel listInfoAutoDebet = infoAutoDebetRepository.getInfoAutoDebetByNoka(noka);

        if (listInfoAutoDebet == null) {
            bundleResponse.setData(errorHandler.getError("204"), "");
            return bundleResponse;
        }

        bundleResponse.setData(errorHandler.getError("1"), listInfoAutoDebet);

        return bundleResponse;
    }
}