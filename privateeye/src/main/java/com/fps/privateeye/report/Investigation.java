package com.fps.privateeye.report;

import com.fps.privateeye.evidence.EvidenceStore;
import com.fps.privateeye.evidence.data.Data;
import com.fps.privateeye.evidence.style.Style;
import com.fps.privateeye.evidence.Evidence;

public class Investigation {

  private Data mReportData;
  private Style mReportStyle;

  Investigation(Data reportData, Style reportStyle) {
    mReportData = reportData;
    mReportStyle = reportStyle;
  }

  void saveTo(EvidenceStore evidenceStore) {
    evidenceStore.addEvidence(new Evidence(mReportData, mReportStyle));
  }
}
