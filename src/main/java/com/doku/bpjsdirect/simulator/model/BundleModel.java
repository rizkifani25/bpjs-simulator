package com.doku.bpjsdirect.simulator.model;

import lombok.Data;

@Data
public class BundleModel<T> {
    private ErrorModel metadata;
    private T response;

    public void setData(ErrorModel metadata, T response) {
        this.metadata = metadata;
        this.response = response;
    }
}