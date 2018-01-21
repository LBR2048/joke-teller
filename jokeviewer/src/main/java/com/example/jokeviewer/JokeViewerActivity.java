package com.example.jokeviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JokeViewerActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);

        TextView jokeTextView = findViewById(R.id.jokeTextView);

        String joke = getIntent().getStringExtra(EXTRA_JOKE);
        jokeTextView.setText(joke);
    }
}
