package com.example.mc_navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.opening, R.string.closing);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_book:
                        Toast.makeText(MainActivity.this, "Book", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_phone:
                        Toast.makeText(MainActivity.this, "Phone", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_laptop:
                        Toast.makeText(MainActivity.this, "Laptop", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_available:
                        Toast.makeText(MainActivity.this, "Available", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_newspaper:
                        Toast.makeText(MainActivity.this, "Reading:News Paper", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_magazine:
                        Toast.makeText(MainActivity.this, "Reading:Magazine", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_trello:
                        Toast.makeText(MainActivity.this, "Work:Trello", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_jira:
                        Toast.makeText(MainActivity.this, "Work: Jira", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_Teams:
                        Toast.makeText(MainActivity.this, "Work: Teams", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                }
                return true;
            }
        });

    }
}