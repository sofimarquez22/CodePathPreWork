package com.example.sofiamarquez.preworkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("Blanca", "Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.LightPinkBackground));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab text user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Blanca");
                }
                else{
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }
                //put the text into our text view once the "change text" button is clicked
                //((TextView)findViewById(R.id.textView)).setText("Android is Awesome!");
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.Black));
                //reset the background color back to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //reset text back to "Hello from Blanca"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Blanca");
            }
        });
        //grab text user inputted
        //put the text into our text view once the "change text" button is clicked

    }

}
