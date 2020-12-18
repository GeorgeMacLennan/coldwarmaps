package com.georgetec.coldwar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapList (View v) {
        setContentView(R.layout.activity_maplist);
    }

    public void goBack (View v) {
        setContentView(R.layout.activity_maplist);
    }

    public void homeScreen (View v) {
        setContentView(R.layout.activity_main);
    }

    public void miamiInfo (View v) {
        setContentView(R.layout.miami_info);
        getSupportActionBar().hide();
    }

    public void satelliteInfo (View v) {
        setContentView(R.layout.satellite_info);
        getSupportActionBar().hide();
    }

    public void moscowInfo (View v) {
        setContentView(R.layout.moscow_info);
        getSupportActionBar().hide();
    }

    public void cartelInfo (View v) {
        setContentView(R.layout.cartel_info);
        getSupportActionBar().hide();
    }

    public void armadaInfo (View v) {
        setContentView(R.layout.armada_info);
        getSupportActionBar().hide();
    }

    public void crossroadsInfo (View v) {
        setContentView(R.layout.crossroads_info);
        getSupportActionBar().hide();
    }

    public void checkmateInfo (View v) {
        setContentView(R.layout.checkmate_info);
        getSupportActionBar().hide();
    }

    public void garrisonInfo (View v) {
        setContentView(R.layout.garrison_info);
        getSupportActionBar().hide();
    }

    public void nuketownInfo (View v) {
        setContentView(R.layout.nuketown_info);
        getSupportActionBar().hide();
    }

    public void raidInfo (View v) {
        setContentView(R.layout.raid_info);
        getSupportActionBar().hide();
    }

    public void thePinesInfo (View v) {
        setContentView(R.layout.thepines_info);
        getSupportActionBar().hide();
    }
}