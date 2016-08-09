package com.bulbulhossen.windows_zoomview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

//public class Floating extends AppCompatActivity implements View.OnClickListener{
public class Floating extends AppCompatActivity{
    private FABToolbarLayout layout;
    private View one, two, three, four;
    private View fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floating_toolbar);

/*        layout = (FABToolbarLayout) findViewById(R.id.fabtoolbar);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        fab = findViewById(R.id.fabtoolbar_fab);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        layout.hide();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Element clicked", Toast.LENGTH_SHORT).show();*/
    }
}