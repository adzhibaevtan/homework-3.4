package com.earth.homework_34;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.earth.homework_34.databinding.ActivityMainBinding;
import com.earth.homework_34.fragment.ContinentsFragment;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continents, new ContinentsFragment()).addToBackStack(null).commit();
    }
}