package com.bryant.garrett.criminal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private SimpleDateFormat dateFormatter;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();

        dateFormatter = new SimpleDateFormat("EEEE, MMM d, yyyy");
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }
    public String getFormattedDate() {
        return dateFormatter.format(mDate);
    }
    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
