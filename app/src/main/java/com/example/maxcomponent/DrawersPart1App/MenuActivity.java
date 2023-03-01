package com.example.maxcomponent.DrawersPart1App;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maxcomponent.MainActivity;
import com.example.maxcomponent.R;

public class MenuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.drawer_toolbaMenuAct);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //pop up menu //sorry for wrong button name
        Button ctxMenuBtn;
        ctxMenuBtn = findViewById(R.id.ctxMenuButtion);
        ctxMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ctxfirstopt Clicked",Toast.LENGTH_SHORT).show();
            showPopUP(view);
            }
        });

        //Context Menu on Long tap
        TextView textView = findViewById(R.id.ctxMenuText);

        registerForContextMenu(textView);

    }
public void  showPopUP(View v)
{
    PopupMenu popupMenu = new PopupMenu(this,v);
    popupMenu.setOnMenuItemClickListener(this);
    popupMenu.inflate(R.menu.popup_menu);
    popupMenu.show();
}


//Context Menu from Here On Overriden Methods 1 onCreateContextMenu, 2 .onContextItemSelected
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case  R.id.ctxfirstopt:
                Toast.makeText(this,"ctxfirstopt Clicked",Toast.LENGTH_SHORT).show();
                return  true;
            case  R.id.ctxtwoopt:
                Toast.makeText(this,"ctxtwoopt Clicked",Toast.LENGTH_SHORT).show();
                return  true;

            case  R.id.ctxthreeopt:
                Toast.makeText(this,"ctxthreeopt Clicked",Toast.LENGTH_SHORT).show();
                return  true;

        }
        return super.onContextItemSelected(item);

    }
//it can used for back button and option menu in navigation bar  clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //for back
                onBackPressed();
                return true;
            case R.id.firstopt:
                Toast.makeText(this,"firstopt",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.secondopt:

                Toast.makeText(this,"secondopt",Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }

//Pop UP menu
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
         case   R.id.popupFirst:
            Toast.makeText(this,"Popup First Clicked",Toast.LENGTH_SHORT).show();
            return  true ;
        }
        return false;
    }


//option menu
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.option_menu_first,menu);

    return true;
}

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.firstopt:
//
//
//                Toast.makeText(this,"firstopt",Toast.LENGTH_SHORT).show();
//                break;
//            case  R.id.secondopt:
//
//                Toast.makeText(this,"secondopt",Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        return  true;
//
//    }
}