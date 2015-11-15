package com.fps.privateeye.viewmodel;

import android.graphics.drawable.Drawable;

public class LogViewModel {

    private String mTitle;
    private String mSubtitle;
    private int mIconResource;
    private Drawable mIconDrawable;
    private String mLog;

    //region BUILDER
    public static class Builder {
        private String title;
        private String subtitle;
        private int iconResource;
        private Drawable iconDrawable;
        private String log;

        public Builder setTitle(String mTitle) {
            this.title = mTitle;
            return this;
        }

        public Builder setSubtitle(String mSubtitle) {
            this.subtitle = mSubtitle;
            return this;
        }

        public Builder setIconResource(int mIconResource) {
            this.iconResource = mIconResource;
            return this;
        }

        public Builder setIconDrawable(Drawable mIconDrawable) {
            this.iconDrawable = mIconDrawable;
            return this;
        }

        public Builder setLog(String log) {
            this.log = log;
            return this;
        }

        public LogViewModel build() {
            LogViewModel logViewModel = new LogViewModel();
            logViewModel.mTitle = title;
            logViewModel.mSubtitle = subtitle;
            logViewModel.mIconResource = iconResource;
            logViewModel.mIconDrawable = iconDrawable;
            logViewModel.mLog = log;
            return logViewModel;
        }
    }
    //endregion

    public int getIconResource() {
        return mIconResource;
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

    public String getLog() {
        return mLog;
    }
}
