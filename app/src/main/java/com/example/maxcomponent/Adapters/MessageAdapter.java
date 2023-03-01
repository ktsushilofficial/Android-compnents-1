package com.example.maxcomponent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.maxcomponent.Models.MessageModel;
import com.example.maxcomponent.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter  extends ArrayAdapter<MessageModel> {
    public  MessageAdapter(Context context, ArrayList<MessageModel> messageModelArrayList)
    {
        super(context, R.layout.item_listviewfirst,messageModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MessageModel messageModel = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_listviewfirst,parent,false);

        }
        CircleImageView imageView = convertView.findViewById(R.id.msgimgaeview);
        TextView name =  convertView.findViewById(R.id.msgsender);
        TextView lastmessg =  convertView.findViewById(R.id.msgLast);
        TextView time =  convertView.findViewById(R.id.msgTime);
        //setting values
        imageView.setImageResource(messageModel.getImg());
        name.setText(messageModel.getName());
        lastmessg.setText(messageModel.getLastmessage());
        time.setText(messageModel.getTime());

        return convertView;
    }

}
