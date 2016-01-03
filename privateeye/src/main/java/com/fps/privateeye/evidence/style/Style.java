package com.fps.privateeye.evidence.style;

import android.graphics.drawable.Drawable;

public interface Style {

  /**
   * @return a integer representing a color to associate with this report background
   */
  Integer getBackgroundColor();

  /**
   * @return a Drawable that will be displayed as the report icon
   */
  Drawable getIconDrawable();
}
