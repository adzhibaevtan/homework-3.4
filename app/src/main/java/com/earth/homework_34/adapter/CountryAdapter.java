package com.earth.homework_34.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.earth.homework_34.databinding.ItemCountryBinding;
import com.earth.homework_34.databinding.ItemCountryBinding;
import com.earth.homework_34.model.Country;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private final ArrayList<Country> list;


    public CountryAdapter(ArrayList<Country> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemCountryBinding binding;

        public ViewHolder(@NonNull ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Country country) {
            Glide.with(binding.countryFlag).load(list.get(getAdapterPosition()).getFlag()).into(binding.countryFlag);
            binding.tvCountry.setText(country.getCountry());
            binding.tvCapital.setText(country.getCapital());
        }
    }
}
