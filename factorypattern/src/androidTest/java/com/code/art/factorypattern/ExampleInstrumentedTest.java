package com.code.art.factorypattern;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    public static final String TAG = "TestFactory";

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.code.art.factorypattern", appContext.getPackageName());
    }

    @Test
    public void testSpGet() {
        Data data = new DataFactory().getDataSource(DataFrom.SP).get();
        Log.d(TAG, "testSpGet: " + data.data);

    }

    @Test
    public void testNetworkGet(){
        Data data = new DataFactory().getDataSource(DataFrom.NETWORK).get();
        Log.d(TAG, "testSpGet: " + data.data);
    }

    @Test
    public void testSpSet(){
        Data data = new Data("set data from sp");
        new DataFactory().getDataSource(DataFrom.SP).set(data);
    }

    @Test
    public void testNetworkSet(){
        Data data = new Data("set data from network");
        new DataFactory().getDataSource(DataFrom.NETWORK).set(data);
    }


}
