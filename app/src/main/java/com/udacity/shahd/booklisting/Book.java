package com.udacity.shahd.booklisting;

/**
 * Created by shahd on 4/22/17.
 */

public class Book {
    private String mTitle;
    private String mDescription;
    private String mAuthor;

    public Book(String mTitle, String mDescription, String mAuthor) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mAuthor = mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAuthor() {
        return mAuthor;
    }

}
