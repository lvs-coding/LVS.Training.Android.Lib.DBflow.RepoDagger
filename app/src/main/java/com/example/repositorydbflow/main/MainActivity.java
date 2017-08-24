package com.example.repositorydbflow.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.repositorydbflow.R;
import com.example.repositorydbflow.application.App;
import com.example.repositorydbflow.data.local.Customers;
import com.example.repositorydbflow.data.local.DbRepoitory;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DbRepoitory repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        List<Customers> customers = repo.getData();


    }
}
