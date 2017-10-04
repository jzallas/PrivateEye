package com.fps.privateeye.viewmodel;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fps.privateeye.R;

public class ReportViewHolder extends BaseViewHolder<ReportViewModel> {

    private enum CardState {
        EXPANDED(R.drawable.ic_arrow_up, Integer.MAX_VALUE),
        COLLAPSED(R.drawable.ic_arrow_down, 2);


        private int mStateImageResId;
        private int mMaxLines;

        CardState(int stateImageResId, int maxLines) {
            this.mStateImageResId = stateImageResId;
            this.mMaxLines = maxLines;
        }

        public int getStateImageResId() {
            return mStateImageResId;
        }

        public int getMaxLines() {
            return mMaxLines;
        }
    }

    private TextView mTitle;
    private TextView mSubtitle;
    private TextView mLog;
    private ImageView mIcon;
    private ImageView mCollaspsedButton;
    private CardView mCardView;
    private CardState mCurrentState = CardState.COLLAPSED;

    public ReportViewHolder(View view) {
        super(view);
        mTitle = (TextView) view.findViewById(R.id.title_text);
        mSubtitle = (TextView) view.findViewById(R.id.subtitle_text);
        mLog = (TextView) view.findViewById(R.id.log_text);
        mIcon = (ImageView) view.findViewById(R.id.icon);
        mCollaspsedButton = (ImageView) view.findViewById(R.id.collapsed_button);
        mCardView = (CardView) view.findViewById(R.id.card_view);
    }

    @Override
    public void bindView(ReportViewModel data) {
        mTitle.setText(data.getTitle());
        mSubtitle.setText(data.getSubtitle());
        mLog.setText(data.getDescription());
        mIcon.setVisibility(View.GONE);
        mCollaspsedButton.setImageResource(mCurrentState.getStateImageResId());
        mCollaspsedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mCurrentState) {
                    case COLLAPSED:
                        mCurrentState = CardState.EXPANDED;
                        mCollaspsedButton.setImageResource(CardState.EXPANDED.getStateImageResId());
                        mLog.setMaxLines(CardState.EXPANDED.getMaxLines());
                        break;

                    case EXPANDED:
                        mCurrentState = CardState.COLLAPSED;
                        mCollaspsedButton.setImageResource(CardState.COLLAPSED.getStateImageResId());
                        mLog.setMaxLines(CardState.COLLAPSED.getMaxLines());
                        break;
                    default:
                        //swallow
                }
            }
        });

        if (data.getIconDrawable() != null) {
            mIcon.setImageDrawable(data.getIconDrawable());
            mIcon.setVisibility(View.VISIBLE);
        } else if (data.getIconResource() > 0) {
            mIcon.setImageResource(data.getIconResource());
            mIcon.setVisibility(View.VISIBLE);
        } else {
            mIcon.setImageResource(R.mipmap.ic_launcher);
            mIcon.setVisibility(View.VISIBLE);
        }
    }

}
