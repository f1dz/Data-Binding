package com.iteqno.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.iteqno.databinding.BR;

public class User extends BaseObservable {

    public String email;
    public String name;

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
