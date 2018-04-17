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

public class EventListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_list);

        // Create a list of words
        ArrayList<Event> words = new ArrayList<Event>();
        words.add(new Event("Bualadh ag UCC", "18ú Aibrean 2018", "UCC, Corcaigh", "Beidh oiche dochreidte againn!", R.drawable.ucc));
        words.add(new Event("Bualadh ag CineWorld", "19ú Aibrean 2018", "Sráid Parnell, Baile Átha Cliath", "Táimid ag dul go dti an pictúirlann!", R.drawable.cinema));
        words.add(new Event("An zú", "20ú Aibrean 2018", "", "", R.drawable.zoo));
        words.add(new Event("Oiche amach i Sligeach", "21ú Aibrean 2018", "", "", R.drawable.sligo));
        words.add(new Event("Ag iascaireacht!", "22ú Aibrean 2018", "", "", R.drawable.fish2));
        words.add(new Event("Oiche Earasmus i Londain", "23ú Aibrean 2018", "", "", R.drawable.londain));
        words.add(new Event("Camán i Montreal", "24ú Aibrean 2018", "", "", R.drawable.caman));
        words.add(new Event("Sampla8", "25ú Aibrean 2018", "", "", R.drawable.gaeltacht));
        words.add(new Event("Sampla9", "26ú Aibrean 2018", "", "", R.drawable.gaeltacht));
        words.add(new Event("Sampla10", "27ú Aibrean 2018", "", "", R.drawable.gaeltacht));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        EventAdapter adapter = new EventAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.listview_flavor);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // This code runs when an item in the grid is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // We can use this to find out exactly which episode is clicked on, and pass that information
            // to the MusicActivity class (so it can be updated dynamically)
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