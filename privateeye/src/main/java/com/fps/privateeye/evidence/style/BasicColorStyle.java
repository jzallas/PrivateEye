package com.fps.privateeye.evidence.style;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class BasicColorStyle extends BackgroundStyle {

  private Integer mIconColor;

  public BasicColorStyle(int backgroundColor, int iconColor){
    super(backgroundColor);
    mIconColor = iconColor;
  }

  @Override
  public Drawable getIconDrawable() {
    return new ColorDrawable(mIconColor);
  }
}
