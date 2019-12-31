package com.e.daggertutorial;

import android.app.Application;

public class MyApplication extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = createMyComponent();
    }

    MyComponent createMyComponent(){
        return DaggerMyComponent.builder().build();
    }

    MyComponent getMyComponent(){
        return myComponent;
    }

    public void setMyComponent(MyComponent myComponent){
        this.myComponent = myComponent;
    }
}
