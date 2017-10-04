package com.fps.privateeye.evidence.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BasicData implements Data {

  private Date mCreatedTime;
  SimpleDateFormat createdTimeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
  private String mTitle;
  private String mDescription;


  public BasicData(String title, String description) {
    mTitle = title;
    mDescription = description;
    mCreatedTime = new Date();
  }

  @Override
  public String getTitle() {
    return mTitle;
  }

  @Override
  public String getSubtitle() {
    return createdTimeFormat.format(mCreatedTime);
  }

  @Override
  public String getDescription() {
    return mDescription;
  }
}
