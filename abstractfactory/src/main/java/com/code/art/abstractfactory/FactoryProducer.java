package com.code.art.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(DataType dataType){
        return dataType.getFactory();
    }
}
