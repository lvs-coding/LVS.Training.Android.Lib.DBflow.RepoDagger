package com.example.repositorydbflow.application;


import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;

public class App extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(new FlowConfig.Builder(this).build());

        // Log queries
        FlowLog.setMinimumLoggingLevel(FlowLog.Level.V);


        component = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}
