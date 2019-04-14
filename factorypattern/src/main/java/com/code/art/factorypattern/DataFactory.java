package com.code.art.factorypattern;

public class DataFactory {
    DataSource getDataSource(DataFrom from) {
       return from.getDataSource();
    }
}
