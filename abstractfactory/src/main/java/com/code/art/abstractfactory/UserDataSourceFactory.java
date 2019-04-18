package com.code.art.abstractfactory;

public class UserDataSourceFactory implements AbstractFactory {
    @Override
    public DataSource getLocationDataSource(DataFrom dataFrom) {
        return null;
    }

    @Override
    public DataSource getUserDataSource(DataFrom dataFrom) {
        return dataFrom.getDataSource();
    }
}
