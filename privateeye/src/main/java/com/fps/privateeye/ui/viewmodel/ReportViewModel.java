package com.fps.privateeye.ui.viewmodel;

import android.graphics.drawable.Drawable;

public class ReportViewModel {

  private String mTitle;
  private String mSubtitle;
  private int mBackgroundColor;
  private Drawable mIconDrawable;
  private String mDescription;

  //region BUILDER
  public static class Builder {

    private String title;
    private String subtitle;
    private Drawable iconDrawable;
    private String description;
    private int backgroundColor;

    public Builder setTitle(String mTitle) {
      this.title = mTitle;
      return this;
    }

    public Builder setSubtitle(String mSubtitle) {
      this.subtitle = mSubtitle;
      return this;
    }

    public Builder setBackgroundColor(int backgroundColor){
      this.backgroundColor = backgroundColor;
      return this;
    }

    public Builder setIconDrawable(Drawable mIconDrawable) {
      this.iconDrawable = mIconDrawable;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public ReportViewModel build() {
      ReportViewModel logViewModel = new ReportViewModel();
      logViewModel.mTitle = title;
      logViewModel.mSubtitle = subtitle;
      logViewModel.mIconDrawable = iconDrawable;
      logViewModel.mDescription = description;
      logViewModel.mBackgroundColor = backgroundColor;
      return logViewModel;
    }
  }
  //endregion

  private ReportViewModel() {
    //empty constructor
  }

  public int getBackgroundColor() {
    return mBackgroundColor;
  }

  public String getTitle() {
    return mTitle;
  }

  public String getSubtitle() {
    return mSubtitle;
  }

  public Drawable getIconDrawable() {
    return mIconDrawable;
  }

  public String getDescription() {
    return mDescription;
  }
}
