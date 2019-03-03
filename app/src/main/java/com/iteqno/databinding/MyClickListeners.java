package com.iteqno.databinding;

import android.content.Context;
import android.view.View;

import com.iteqno.databinding.model.User;

public class MyClickListeners {

    private Context context;
    private User user;

    public MyClickListeners(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public void onShowToast(View view) {
        user.setName("Johny English");
        user.setEmail("johny@english.com");
    }
}
