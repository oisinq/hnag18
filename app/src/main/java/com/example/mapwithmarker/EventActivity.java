package com.example.mapwithmarker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    Event event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);

        // This extracts the episode data from the intent
        event = (Event) getIntent().getSerializableExtra("Event");

        // We can now change the artwork and TextViews to match the data in "episode"
        changeAlbumArt();
        changeText();
    }

    /**
     * This changes the album art to that specified in "episode"
     */
    private void changeAlbumArt() {
        ImageView albumArt = (ImageView) findViewById(R.id.event_image);
        albumArt.setImageResource(event.getImageResourceId());
    }

    /**
     * This changes the text to that specified in "episode"
     */
    private void changeText() {
        TextView description = (TextView) findViewById(R.id.event_description);
        description.setText(event.getDescription());

        TextView title = (TextView) findViewById(R.id.event_title);
        title.setText(event.getEventName());

        TextView location = (TextView) findViewById(R.id.event_location);
        location.setText(event.getLocation());

        TextView date = (TextView) findViewById(R.id.event_date);
        date.setText(event.getDate());
    }
}