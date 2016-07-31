package com.aupadhyay.cresendo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    CardView judgeCardView, audienceCardView;

    public void initCardViews()
    {
        judgeCardView = (CardView) findViewById(R.id.judgeCardView);
        audienceCardView = (CardView) findViewById(R.id.audienceCardView);

        judgeCardView.setOnClickListener(this);
        audienceCardView.setOnClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setBackgroundColor(Color.BLACK);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        initCardViews();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.judgeCardView:
                Intent i = new Intent(this, JudgeLoginActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.audienceCardView:
                Toast.makeText(this, "Sorry this app is not for you ", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
