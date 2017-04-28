package com.udacity.shahd.booklisting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shahd on 4/14/17.
 */

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(@NonNull Context context, @NonNull List<Book> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Book currentEarthquake = getItem(position);
        String title = currentEarthquake.getmTitle();
        String description = currentEarthquake.getmDescription();
        String author = currentEarthquake.getmAuthor();

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.book_title);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.book_description);
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.book_author);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        authorTextView.setText(author);

        return listItemView;
    }


}
