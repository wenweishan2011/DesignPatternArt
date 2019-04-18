package com.code.art.abstractfactory;

public enum DataFrom {
    SP(new SpDataSource()),
    NETWORK(new NetworkDataSource());

    private DataSource mDataSource;

    DataFrom(DataSource dataSource) {
        this.mDataSource = dataSource;
    }

    DataSource getDataSource() {
        return this.mDataSource;
    }
}
