package com.llawl.tristonpang.intheloop;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.zxing.integration.android.IntentIntegrator;

public class EventsListActivity extends AppCompatActivity {

    private Button test_button;
    private Button generate_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);

        BottomNavigationView navView = findViewById(R.id.navigationView);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_myinfo:
                        Log.d("InTheLoop", "Nav from EventsList to MyInfo");
                        goToActivity(MyInfoActivity.class);
                        break;
                    case R.id.navigation_events:
                        break;
                    case R.id.navigation_org:
                        Log.d("InTheLoop", "Nav from EventsList to Organisers");
                        goToActivity(OrganisersActivity.class);
                        break;
                }



                return true;
            }
        });
    }

    private void goToActivity(Class destActivity) {
        Intent intent = new Intent(EventsListActivity.this, destActivity);
        finish();
        overridePendingTransition(0,0);
        startActivity(intent);
    }
}
