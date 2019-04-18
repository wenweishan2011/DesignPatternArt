package com.code.art.abstractfactory;

public enum DataType {
    USER(new UserDataSourceFactory()),
    LOCATION(new LocationDataSourceFactory());

    private final AbstractFactory mAbstractFactory;

    DataType(AbstractFactory abstractFactory) {
        this.mAbstractFactory = abstractFactory;
    }

    public AbstractFactory getFactory(){
        return mAbstractFactory;
    }
}
