package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maxcomponent.R;

public class GridViewActivityFirst extends AppCompatActivity {
GridView gridView;
    String[] fruits = {"Volvo", "BMW", "Ford", "Mazda","Frrrari","Audi"};
    int[] images = {R.drawable.indiaflag, R.drawable.indiaflag, R.drawable.indiaflag, R.drawable.indiaflag,R.drawable.indiaflag,R.drawable.indiaflag};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_first);
        gridView = findViewById(R.id.gridviewfirst);
        GridAdapter gridAdapter = new GridAdapter();
        gridView.setAdapter(gridAdapter);

    }

    class  GridAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return fruits.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.item_gridview_first,null);
            ImageView imageView = v.findViewById(R.id.IVgridfirestview);
            TextView textView = v.findViewById(R.id.TVgridfirstview);
            imageView.setImageResource(images[i]);
            textView.setText(fruits[i]);
            return v;
        }
    }
}