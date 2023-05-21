package com.example.projetointegradormapsjava;

import androidx.annotation.NonNull;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MainActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapClick(@NonNull LatLng latLng) {

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng Sorocaba = new LatLng( -23.49974015877038,  -47.39711663919506);
        googleMap.addMarker(new MarkerOptions()
                .position(Sorocaba)
                .title("INDICE DE QUALIDADE DE AR EM SOROCABA 23 IQA"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Sorocaba));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(12.0f));
        }

    }

