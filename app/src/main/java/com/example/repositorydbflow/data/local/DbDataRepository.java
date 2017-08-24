package com.example.repositorydbflow.data.local;


import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.ArrayList;
import java.util.List;

public class DbDataRepository implements DbRepoitory {
    @Override
    public List<Customers> getData() {


        List<Customers> customers = SQLite.select()
                .from(Customers.class)
                .queryList();

        return customers;
    }
}
