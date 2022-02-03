package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
        private ArrayList<User> usersList;

        public recyclerAdapter(ArrayList<User> usersList){
            this.usersList = usersList;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{
        //Here are the 2 TextViews that we made in Layout
            private TextView nameTxt;

            public MyViewHolder(final View view){
                super(view);
                nameTxt = view.findViewById(R.id.textView4);
            }
        }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = usersList.get(position).getUsername();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
