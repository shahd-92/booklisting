package com.udacity.shahd.booklisting;

/**
 * Created by shahd on 4/22/17.
 */

public class Book {
    private String mTitle;
    private String mDescription;
    public Book(String mTitle, String mDescription) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

}
