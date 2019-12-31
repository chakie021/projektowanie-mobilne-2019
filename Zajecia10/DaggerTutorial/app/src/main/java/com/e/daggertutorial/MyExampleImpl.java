package com.e.daggertutorial;

import java.util.Date;

public class MyExampleImpl implements MyExample {
    private long mDate;

    MyExampleImpl(){
        mDate = new Date().getTime();
    }

    @Override
    public long getDate() {
        return mDate;
    }
}
