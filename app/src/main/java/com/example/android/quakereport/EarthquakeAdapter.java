package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {

        super(context, 0, earthquakes);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);


        TextView magnitudeView = (TextView) listItemView.findViewById (R.id.magnitude_holder);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location_holder);
        locationView.setText(currentEarthquake.getLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date_holder);
        dateView.setText(currentEarthquake.getDate());


        return listItemView;
    }



}
