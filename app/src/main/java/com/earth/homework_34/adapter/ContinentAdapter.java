package com.earth.homework_34.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.earth.homework_34.databinding.ItemContinentBinding;
import com.earth.homework_34.model.Continent;
import com.earth.homework_34.utils.OnClickListener;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ViewHolder> {

    private final ArrayList<Continent> list;
    private final OnClickListener onClickListener;

    public ContinentAdapter(ArrayList<Continent> list, OnClickListener onClickListener) {
        this.list = list;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
        private ItemContinentBinding binding;

        public ViewHolder(@NonNull ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continent continent) {
            binding.ibContinent.setImageResource(continent.getContinent());
            binding.cvContinent.setOnClickListener(v -> onClickListener.onClick(continent));
        }
    }
}
