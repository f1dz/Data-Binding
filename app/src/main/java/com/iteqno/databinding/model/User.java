package com.iteqno.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

public class User extends BaseObservable {

    public static ObservableField<String> email = new ObservableField<>();
    public static ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getEmail() {
        return email;
    }
}
