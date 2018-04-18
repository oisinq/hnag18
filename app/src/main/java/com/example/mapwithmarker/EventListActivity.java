/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mapwithmarker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * This is where the code gets a bit more complex - I'm using an adapter that I previously made for one
 * of my Udacity projects (https://github.com/oisin1001/MusicStructureApp), and it just wouldn't work for
 * a while, so it's a bit messy. However, it's functional, which was our priority.
 */
public class EventListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_list);

        /* Create a list of events, with a location, date and description
        Ideally this would link in with the markers on the map, but they don't currently. I don't
        think it would be super difficult to do that. */
        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Bualadh ag UCC", "18ú Aibrean 2018", "UCC, Corcaigh", "Beidh oiche dochreidte againn!", R.drawable.ucc));
        events.add(new Event("Bualadh ag CineWorld", "19ú Aibrean 2018", "Sráid Parnell, Baile Átha Cliath", "Táimid ag dul go dti an pictúirlann!", R.drawable.cinema));
        events.add(new Event("An zú", "20ú Aibrean 2018", "", "", R.drawable.zoo));
        events.add(new Event("Oiche amach i Sligeach", "21ú Aibrean 2018", "", "", R.drawable.sligo));
        events.add(new Event("Ag iascaireacht!", "22ú Aibrean 2018", "", "", R.drawable.fish2));
        events.add(new Event("Oiche Earasmus i Londain", "23ú Aibrean 2018", "", "", R.drawable.londain));
        events.add(new Event("Camán i Montreal", "24ú Aibrean 2018", "", "", R.drawable.caman));
        events.add(new Event("Sampla8", "25ú Aibrean 2018", "", "", R.drawable.gaeltacht));
        events.add(new Event("Sampla9", "26ú Aibrean 2018", "", "", R.drawable.gaeltacht));
        events.add(new Event("Sampla10", "27ú Aibrean 2018", "", "", R.drawable.gaeltacht));

        EventAdapter adapter = new EventAdapter(this, events);

        final ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(adapter);

        // This code runs when an item in the grid is clicked - it loads the current info into the EventActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent episodeIntent = new Intent(EventListActivity.this, EventActivity.class);
                Event event = (Event) listView.getItemAtPosition(position);
                episodeIntent.putExtra("Event", event);
                startActivity(episodeIntent);
            }
        });
    }
}