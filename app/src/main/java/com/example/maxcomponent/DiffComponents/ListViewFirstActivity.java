package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.maxcomponent.Adapters.MessageAdapter;
import com.example.maxcomponent.Models.MessageModel;
import com.example.maxcomponent.R;

import java.util.ArrayList;

public class ListViewFirstActivity extends AppCompatActivity {
ListView listView ;
ArrayList<MessageModel> messageModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_first);
        listView = findViewById(R.id.listView1);
        initArray();
        MessageAdapter messageAdapter  = new MessageAdapter(this,messageModelArrayList);
        listView.setAdapter(messageAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             MessageModel messageModel = (MessageModel)   adapterView.getItemAtPosition(i);
               Toast.makeText(ListViewFirstActivity.this,messageModel.getName(),Toast.LENGTH_SHORT).show();

            }
        });

    }

    void initArray()
    {
        messageModelArrayList = new ArrayList<>();
        messageModelArrayList.add(new MessageModel("Sushil","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
        messageModelArrayList.add(new MessageModel("Amar","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
        messageModelArrayList.add(new MessageModel("Vikash","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
        messageModelArrayList.add(new MessageModel("Ramesh","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
        messageModelArrayList.add(new MessageModel("Suresh","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
        messageModelArrayList.add(new MessageModel("Ram","7:15 pm","How r u","845922150","India",R.drawable.indiaflag));
    }
}