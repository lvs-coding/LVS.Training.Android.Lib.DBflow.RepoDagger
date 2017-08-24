package com.example.repositorydbflow.application;

import com.example.repositorydbflow.data.local.DbDataRepository;
import com.example.repositorydbflow.data.local.DbRepoitory;
import com.example.repositorydbflow.util.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @ApplicationScope
    @Provides
    DbRepoitory provideRepo() {
        return new DbDataRepository();
    }
}
