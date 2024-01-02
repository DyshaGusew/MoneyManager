package com.example.moneymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

import com.example.moneymanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle("Операции");

        binding.floatingButton.setOnClickListener(c -> {
            new AddTransactionFragment().show(getSupportFragmentManager(), null);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}