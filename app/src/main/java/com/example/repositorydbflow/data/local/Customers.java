package com.example.repositorydbflow.data.local;


import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.TabLayout;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.NotNull;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = MyDatabase.class)
public class Customers extends BaseModel {

    public Customers() {    }

    @Column(name = "id")
    @PrimaryKey
    @NotNull
    int id;

    @Column(name = "firstName")
    @NotNull
    String firstName;

    @Column(name = "lastName")
    @NotNull
    String lastName;

    @Column(name = "age")
    int age;
}
