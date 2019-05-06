package com.example.reuseme;

import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserResponse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_response);
    }

    public void chooseDeviceType(View view) {
        Intent intent = new Intent(this,ChooseDeviceActivity.class);
        startActivity(intent);

    }

    public void openForm(View view) {
        String url="https://www.jspigments.com/request-a-pickup/";
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(this, Uri.parse(url));
    }
}
