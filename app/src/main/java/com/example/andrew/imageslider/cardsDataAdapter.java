package com.example.andrew.imageslider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by andrew on 10/6/16.
 */
public class cardsDataAdapter extends ArrayAdapter<String> {

    public cardsDataAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {

        TextView v = (TextView) (contentView.findViewById(R.id.content));
//        TextView v12 = (TextView) (contentView.findViewById(R.id.content1));
//        TextView v13 = (TextView) (contentView.findViewById(R.id.content2));
        ImageView v123 = (ImageView) (contentView.findViewById(R.id.contentImage));

        v.setText(getItem(position));
        return contentView;
    }
}