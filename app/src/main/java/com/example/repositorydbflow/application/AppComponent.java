package com.example.repositorydbflow.application;

import com.example.repositorydbflow.main.MainActivity;
import com.example.repositorydbflow.util.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
