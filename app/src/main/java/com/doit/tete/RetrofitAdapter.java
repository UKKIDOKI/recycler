package com.doit.tete;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.ViewHolder> {

    private List<Device> items = new ArrayList<>();

    public void addItem(Device device) {
        items.add(device);
    }


//    public RetrofitAdapter(List<Device> items) {
//        this.items = items;
//    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Device item = items.get(position);
//        holder.textView.setText(item.getDeviceName());
//        holder.textView2.setText(item.getDeviceDesc());
//        Picasso.get()
//                .load(item.getImageUrl())
//                .into(holder.imageView);
        Device device = items.get(position);
        holder.setItem(device);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }



//    public void addItem(Data item) {               // 데이터를 가져와 arraylist에 저장할 메서드
//    items.add(item);         //list안에 가져온 파라미터  추가
//    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView, textView2;
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
        }

        public void setItem(Device device) {
            textView.setText(device.getDeviceName());
            textView2.setText(device.getDeviceDesc());
                Picasso.get()
                .load(device.getImageUrl())
                .into(imageView);
            // imageView.setText(item.getOpenDt());
        }
    }

}

