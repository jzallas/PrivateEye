package com.fps.privateeye.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fps.privateeye.R;
import com.fps.privateeye.viewmodel.LogViewModel;

public class LogListFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_log_list, container, false);
        //TODO
        return rootView;
    }

        private LogViewModel createFakeModel(){
        return new LogViewModel.Builder()
                .setTitle("")
                .setSubtitle("")
//                .setDescription("")
                .build();

    }
}
