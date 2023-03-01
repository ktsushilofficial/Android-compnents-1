package com.example.maxcomponent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.maxcomponent.R;

import java.util.List;

public class RecyclerFirstAdapter extends RecyclerView.Adapter<RecyclerFirstAdapter.ViewHolderFirst> {
    private List<String> mData;
    private LayoutInflater mInflater;
    private AdapterView.OnItemClickListener mClickListener;

    // data is passed into the constructor
    public RecyclerFirstAdapter(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        mClickListener = (AdapterView.OnItemClickListener) context;
        this.mData = data;
    }


    @NonNull
    @Override
    public ViewHolderFirst onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recview_item_first, parent, false);
        return new ViewHolderFirst(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFirst holder, int position) {
        String animal = mData.get(position);
        holder.name.setText(animal);
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolderFirst extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;

        public ViewHolderFirst(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvAnimalName);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
           // Toast.makeText(view.getContext(), "Hello", Toast.LENGTH_SHORT).show();
            if (mClickListener != null) {
                mClickListener.onItemClick(null, view, getAdapterPosition(), view.getId());
            }
        }

    }
}