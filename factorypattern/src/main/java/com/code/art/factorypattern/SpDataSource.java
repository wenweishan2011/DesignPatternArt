package com.code.art.factorypattern;

import android.util.Log;

public class SpDataSource implements DataSource {
    @Override
    public Data get() {
        Data data = new Data("data from sp");
        return data;
    }

    @Override
    public void set(Data data) {
        Log.d("TestFactory", "SpDataSource set: " + data.data);
    }
}
