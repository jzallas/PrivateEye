package com.fps.privateeye.evidence;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

import com.fps.privateeye.evidence.data.Data;
import com.fps.privateeye.evidence.style.Style;

public final class Evidence {

  private Data mData;
  private Style mStyle;

  public Evidence(Data data, Style style) {
    this.mData = data;
    this.mStyle = style;
  }

  public String getTitle() {
    return mData.getTitle();
  }

  public String getSubtitle() {
    return mData.getSubtitle();
  }

  public String getDescription() {
    return mData.getDescription();
  }

  public Drawable getIconDrawable() {
    return mStyle.getIconDrawable();
  }

  public int getBackgroundColor() {
    Integer styleBgColor = mStyle.getBackgroundColor();
    return styleBgColor != null ? styleBgColor : Color.WHITE;
  }

}
