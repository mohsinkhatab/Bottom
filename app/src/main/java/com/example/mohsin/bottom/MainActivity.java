package com.example.mohsin.bottom;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottom=findViewById(R.id.nav);
        bottom.setOnNavigationItemSelectedListener(navselect);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navselect= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            android.support.v4.app.Fragment select=null;
            switch (item.getItemId()){
                case R.id.home:
                    select=new Home();
                    break;
                case R.id.msg:
                    select=new Message();
                    break;
                case R.id.call:
                    select=new Calls();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frameee,select).commit();
            return true;
        }
    };
}
