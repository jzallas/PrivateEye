package com.fps.privateeye.viewmodel;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fps.privateeye.R;

public class LogViewHolder extends BaseViewHolder<LogViewModel> {

    private TextView mTitle;
    private TextView mSubtitle;
    private TextView mLog;
    private ImageView mIcon;
    private ImageView mCollaspsedButton;
    private LinearLayout mContentContainer;
    private CardView mCardView;

    public LogViewHolder(View view) {
        super(view);
        mTitle = (TextView) view.findViewById(R.id.title_text);
        mSubtitle = (TextView) view.findViewById(R.id.subtitle_text);
        mLog = (TextView) view.findViewById(R.id.log_text);
        mIcon = (ImageView) view.findViewById(R.id.icon);
        mCollaspsedButton = (ImageView) view.findViewById(R.id.collapsed_button);
        mContentContainer = (LinearLayout) view.findViewById(R.id.content);
        mCardView = (CardView) view.findViewById(R.id.card_view);
    }

    @Override
    public void bindView(LogViewModel data) {
        mTitle.setText(data.getTitle());
        mSubtitle.setText(data.getSubtitle());
        mIcon.setImageResource(data.getIconResource());
        mLog.setText(data.getLog());
    }

}
