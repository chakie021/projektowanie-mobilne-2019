package com.e.daggertutorial;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModuleMock.class)
public interface MyComponentMock extends MyComponent{
}
