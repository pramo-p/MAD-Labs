package com.example.mtrsliit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //define text view object
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the textview within the layout for class object

        textview2 = findViewById(R.id.textView);

        //This set value ofMsg2 asthe text string

        textview2.setText(R.string.Msg2);

        Log.i("LifeCycle", "OnCreate() Invoked!!!");
    }
        public void onStart()
        {
            super.onStart();
            Log.i("LifeCycle","OnStart() Invoked!!!");
        }
        public void onRestart()
        {
            super.onRestart();
            Log.i("LifeCycle", "OnRestart() Invoked!!!");
        }
         public void onStop() {
             super.onStop();
             Log.i("LifeCycle", "OnStop() Invoked!!!");
         }

         public void onResume()
         {
         super.onResume();
         Log.i("LifeCycle", "OnResume(() Invoked!!!");
         }


    }

