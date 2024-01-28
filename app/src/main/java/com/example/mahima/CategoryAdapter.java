package com.example.mahima;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.Viewholder> {

    private List<CategoryModel> categoryModelList;

    public CategoryAdapter(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_cat_items,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        String imageUrl = categoryModelList.get(position).getImageurl();
        holder.setData(imageUrl);
    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView Title;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            Title = itemView.findViewById(R.id.title);
        }
        private void setData(String url){

            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.Title.setText(categoryModelList.get(getAdapterPosition()).getTitle());

        }
    }

}
