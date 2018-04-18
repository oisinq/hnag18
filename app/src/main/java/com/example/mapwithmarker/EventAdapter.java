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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * EventAdapter is an ArrayAdapter that can provide the layout for each list item
 */
public class EventAdapter extends ArrayAdapter<Event>  {

    public EventAdapter(Context context, ArrayList<Event> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        // Get the Event object located at this position in the list
        Event currentEvent = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon);
        imageView.setImageResource(currentEvent.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        TextView nameView = (TextView) listItemView.findViewById(R.id.event_name_text_view);
        nameView.setText(currentEvent.getEventName());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateView.setText(currentEvent.getDate());

        // Return the whole list item layout (containing 2 TextViews and the image) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}