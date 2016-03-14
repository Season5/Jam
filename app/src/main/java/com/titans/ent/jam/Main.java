package com.titans.ent.jam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListeneronButton1();
        addListeneronButton2();
    }
    public void addListeneronButton1()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainSoundCloud.class);
                startActivity(intent);

            }
        });
    }
    public void addListeneronButton2()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0)
            {
                Intent intent = new Intent(context, MainSoundCloud.class);
                startActivity(intent);

            }
        });
    }

}
