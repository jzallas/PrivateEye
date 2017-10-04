package com.fps.privateeye.evidence.style;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class BasicResourceStyle extends BackgroundStyle {

  private Context mContext;
  private int mResourceId;

  public BasicResourceStyle(Context context, int resourceId, int backgroundColor) {
    super(backgroundColor);
    mContext = context;
    mResourceId = resourceId;
  }

  @Override
  public Drawable getIconDrawable() {
    return mContext == null ? null : mContext.getResources().getDrawable(mResourceId);
  }
}
