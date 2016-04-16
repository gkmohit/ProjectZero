package com.mohitkishore.www.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.stockHawkButton)
    Button mStockHawkButton;

    @Bind(R.id.buildItBuggerButton)
    Button mBuildItBiggerButton;

    @Bind(R.id.capstoneButton)
    Button mCapstoneButton;

    @Bind(R.id.goUbiqutiousButton)
    Button mGoUbiqutiousButton;

    @Bind(R.id.popularMovieButton)
    Button mPopularMovieButton;

    @Bind(R.id.makeYourAppMaterialButton)
    Button mMakeYourAppMaterialButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMakeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_material));
            }
        });
        mPopularMovieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_popular));
            }
        });
        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_stock));
            }
        });

        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_build_it));
            }
        });

        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_capstone));
            }
        });

        mGoUbiqutiousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast(getResources().getString(R.string.this_button_will_launch_ubiqutious));
            }
        });
    }

    public void makeToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
