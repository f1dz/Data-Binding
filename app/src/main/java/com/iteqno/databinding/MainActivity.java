package com.iteqno.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iteqno.databinding.databinding.ActivityMainBinding;
import com.iteqno.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    private User user;
    private MyClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.setName("Khofidin");
        user.setEmail("offiedz@gmail.com");

        binding.setVm(user);

        listeners = new MyClickListeners(this, user);
        binding.setMylisteners(listeners);
    }
}
