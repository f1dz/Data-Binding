package com.iteqno.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickListeners {

    private Context context;

    public MyClickListeners(Context context) {
        this.context = context;
    }

    public void onShowToast(View view) {
        Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show();
    }
}
