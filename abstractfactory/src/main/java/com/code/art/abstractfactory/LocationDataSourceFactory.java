package com.code.art.abstractfactory;

public class LocationDataSourceFactory implements AbstractFactory {
    @Override
    public DataSource getLocationDataSource(DataFrom dataFrom) {
        return dataFrom.getDataSource();
    }

    @Override
    public DataSource getUserDataSource(DataFrom dataFrom) {
        //不支持
        return null;
    }
}
