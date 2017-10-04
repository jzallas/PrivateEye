package com.fps.privateeye.evidence.style;

public abstract class BackgroundStyle implements Style {

  private int mBackgroundColor;

  public BackgroundStyle(int backgroundColor){
    mBackgroundColor = backgroundColor;
  }

  @Override
  public Integer getBackgroundColor() {
    return mBackgroundColor;
  }
}
