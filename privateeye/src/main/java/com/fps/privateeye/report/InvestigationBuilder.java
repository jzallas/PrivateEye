package com.fps.privateeye.report;

import android.content.Context;

import com.fps.privateeye.evidence.data.Data;
import com.fps.privateeye.evidence.style.Style;
import com.fps.privateeye.evidence.EvidenceStore;
import com.fps.privateeye.evidence.style.DefaultStyle;

public final class InvestigationBuilder {

  private Style mStyle;
  private Data mData;
  private Context mContext;
  private EvidenceStore mEvidenceStore;

  public InvestigationBuilder(Context context, EvidenceStore evidenceStore){
    mContext = context;
    mEvidenceStore = evidenceStore;
  }

  public InvestigationBuilder withStyle(Style reportStyle){
    mStyle = reportStyle;
    return this;
  }

  public InvestigationBuilder withData(Data reportData){
    mData = reportData;
    return this;
  }

  public void report(){
    if (mData == null){
      // can't do anything if raw report data wasn't provided
      return;
    }

    if (mStyle == null){
      mStyle = new DefaultStyle(mContext);
    }

    Investigation investigation = new Investigation(mData, mStyle);
    investigation.saveTo(mEvidenceStore);
  }
}
