package com.example.testrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class myadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    mymember mymember ;
    Context context;
    ArrayList<mymember> mymembers;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder h = (ViewHolder)holder;
        h.onBind(mymembers.get(position));
    }

    public void setmylist(ArrayList<mymember> list){
        this.mymembers= list;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return mymembers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tilt;
        private ImageView iv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tilt = (TextView)itemView.findViewById(R.id.tv);
            iv = (ImageView)itemView.findViewById(R.id.iv);
        }

        void onBind(mymember item){
            tilt.setText(item.getTilt());
            iv.setImageResource(item.iv);
        }
    }


}
