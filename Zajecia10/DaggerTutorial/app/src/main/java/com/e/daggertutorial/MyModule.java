package com.e.daggertutorial;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Singleton
    @Provides
    static MyExample provideMyExample(){
        return new MyExampleImpl();
    }

}
