package com.fps.privateeye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fps.privateeye.evidence.data.BasicData;
import com.fps.privateeye.evidence.style.BasicColorStyle;

public class SampleFragment extends Fragment {

  public static final String TAG = SampleFragment.class.getName();

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_sample, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // plant the private eye on the parent screen so it can report any findings
    PrivateEye.plant(this);
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    PrivateEye.dismiss();
  }

  @Override
  public void onResume() {
    super.onResume();
    PrivateEye.investigation(getActivity())
        .withData(
            new BasicData("onResume()",
                "The LifeCycle method onResume() has occurred in the Fragment"))
        .withStyle(new BasicColorStyle(0xFF84CBD0, 0xFF4259D0))
        .report();
  }
}
