package com.example.desiree.videoapp3;
// https://www.youtube.com/watch?v=6qo_Opqjhew this code from this
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class UserDetailsActivity extends AppCompatActivity {

    private Button skipButton;

    public void press(){
        skipButton = (Button)findViewById(R.id.skipButton);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connectActivities = new Intent(UserDetailsActivity.this, MainActivity.class);
                startActivity(connectActivities);
            }
        });
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        press();
    }

}
