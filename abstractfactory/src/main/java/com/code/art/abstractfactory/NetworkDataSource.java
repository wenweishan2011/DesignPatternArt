package com.code.art.abstractfactory;

import android.util.Log;

public class NetworkDataSource implements DataSource {
    @Override
    public Data get() {
        Data data = new Data("data from network");
        return data;
    }

    @Override
    public void set(Data data) {
        Log.d("TestFactory", "set: " + data.data);
    }
}
