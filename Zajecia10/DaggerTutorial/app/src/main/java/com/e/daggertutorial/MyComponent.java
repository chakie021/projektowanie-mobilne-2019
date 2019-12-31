package com.e.daggertutorial;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void f0(MainActivity mainActivity);
}
