package com.example.mapwithmarker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng cootehill = new LatLng(54.073242, -7.081571);
        LatLng lk = new LatLng(54.951012, -7.736506);
        LatLng conradh = new LatLng(53.337042, -6.263078);
        LatLng blackrock = new LatLng(53.300807, -6.177145);
        LatLng doyles = new LatLng(53.345658, -6.257408);
        LatLng athlone = new LatLng(53.423673, -7.939116);
        LatLng wexford = new LatLng(52.336723, -6.460481);
        LatLng belfast = new LatLng(54.600161, -5.933845);
        LatLng galway = new LatLng(53.270185, -9.058131);
        LatLng london = new LatLng(51.517075, -0.078260);
        LatLng montreal = new LatLng(45.462017, -73.588981);
        LatLng loc1 = new LatLng(51.891771, -8.493376);
        LatLng loc2 = new LatLng(53.350299, -6.267666);
        LatLng loc3 = new LatLng(53.355389, -6.304908);
        LatLng loc4 = new LatLng(54.278465, -8.459840);
        LatLng loc5 = new LatLng(54.339242, -9.821286);
        LatLng loc6 = new LatLng(52.133782, -10.268193);
        LatLng loc7 = new LatLng(54.951109, -8.360984);
        LatLng loc8 = new LatLng(54.707458, -8.728017);
        LatLng loc9 = new LatLng(54.281200, -8.4651096);
        LatLng loc10 = new LatLng(53.234304, -6.553906);
        LatLng loc11 = new LatLng(52.776516, -7.63056);

       //53.345658, -6.257408

        MarkerOptions m1 = new MarkerOptions().position(cootehill).title("Cootehill Gaeltacht");
        MarkerOptions m2 = new MarkerOptions().position(lk).title("Letterkenny Gaeltacht");
        MarkerOptions m3 = new MarkerOptions().position(doyles).title("Doyle's Gaeltacht");

        googleMap.addMarker(m1);
        googleMap.addMarker(m2);
        googleMap.addMarker(m3);
        googleMap.addMarker(new MarkerOptions().position(conradh).title("Club Conradh"));
        googleMap.addMarker(new MarkerOptions().position(blackrock).title("Blackrock"));
        googleMap.addMarker(new MarkerOptions().position(athlone).title("Athlone Gaeltacht"));
        googleMap.addMarker(new MarkerOptions().position(wexford).title("Wexford"));
        googleMap.addMarker(new MarkerOptions().position(belfast).title("Belfast"));
        googleMap.addMarker(new MarkerOptions().position(galway).title("Galway"));
        googleMap.addMarker(new MarkerOptions().position(loc1).title("Bualadh ag UCC"));
        googleMap.addMarker(new MarkerOptions().position(loc2).title("Bualadh ag CineWorld"));
        googleMap.addMarker(new MarkerOptions().position(loc3).title("An zú"));
        googleMap.addMarker(new MarkerOptions().position(loc4).title("Oiche amach i Sligeach"));
        googleMap.addMarker(new MarkerOptions().position(loc5).title("Ag iascaireacht!"));
        googleMap.addMarker(new MarkerOptions().position(loc6).title("L6"));
        googleMap.addMarker(new MarkerOptions().position(loc7).title("L7"));
        googleMap.addMarker(new MarkerOptions().position(loc8).title("L8"));
        googleMap.addMarker(new MarkerOptions().position(loc9).title("L9"));
        googleMap.addMarker(new MarkerOptions().position(loc10).title("L10"));
        googleMap.addMarker(new MarkerOptions().position(loc11).title("L11"));
        googleMap.addMarker(new MarkerOptions().position(london).title("Oiche Earasmus i Londain"));
        googleMap.addMarker(new MarkerOptions().position(montreal).title("Camán i Montreal"));


        googleMap.moveCamera(CameraUpdateFactory.newLatLng(cootehill));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(athlone, 6.8f));
    }

    public void openEvents(View view) {
        Intent colorsIntent = new Intent(MapsMarkerActivity.this, EventListActivity.class);
        startActivity(colorsIntent);
    }

    public void openNewEvent(View view) {
        Intent colorsIntent = new Intent(MapsMarkerActivity.this, NewEventActivity.class);
        startActivity(colorsIntent);
    }
}
