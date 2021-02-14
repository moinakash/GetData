package com.example.getdata.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.getdata.R;
import com.example.getdata.modelclasses.SubArray;


import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{


    private Context mContext;
    private List<SubArray> mData;

    public RecyclerViewAdapter(Context mContext, List<SubArray> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflator= LayoutInflater.from(mContext);
        view=mInflator.inflate(R.layout.items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        int ab = mData.get(position).getWorkerId();
        String abs = mData.get(position).getSectorName();

        holder.tv_press_title.setText(""+abs);


        //setting onclick listener
  /*      holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(mContext, DetailsActivity.class);
//                passing data to book activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Category",mData.get(position).getCategory());
                intent.putExtra("Description",mData.get(position).getDescription());

                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

//                start the activity
                mContext.startActivity(intent);



            }
        });
*/

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_press_title,tv_Des_id;




        public MyViewHolder(View itemView) {
            super(itemView);
            tv_press_title=(TextView)itemView.findViewById(R.id.idGirdViewText);

        }
    }


}