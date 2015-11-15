package com.fps.privateeye.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fps.privateeye.R;
import com.fps.privateeye.viewmodel.BaseViewHolder;
import com.fps.privateeye.viewmodel.LogViewHolder;
import com.fps.privateeye.viewmodel.LogViewModel;

import java.util.List;

public class LogListAdapter extends RecyclerView.Adapter<BaseViewHolder<LogViewModel>> {


    private Context mContext;

    private List<LogViewModel> mData;

    public LogListAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public BaseViewHolder<LogViewModel> onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_log, parent, false);
        return new LogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder<LogViewModel> holder, int position) {
        holder.bindView(mContext, getItem(position));
    }

    private LogViewModel getItem(int pos) {
        return mData == null ? null : mData.get(pos);
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }
}
