package com.fps.privateeye.evidence;

import com.fps.privateeye.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class EvidenceStore implements Iterable<Evidence> {

  private static final int MAXIMUM_ALLOWED_REPORTS = 100;

  private List<Evidence> mReportList = Collections
      .synchronizedList(new ArrayList<Evidence>());

  public void addEvidence(Evidence evidence) {

    // remove the oldest item if the list grows beyond the allowed size
    if (mReportList.size() >= MAXIMUM_ALLOWED_REPORTS) {
      mReportList.remove(0);
    }

    // append the new report to the end
    mReportList.add(evidence);
  }

  public int size() {
    return mReportList.size();
  }

  public Evidence getEvidence(int position) {
    if (CollectionUtils.isWithinBounds(mReportList, position)) {
      return mReportList.get(position);
    }
    return null;
  }

  @Override
  public Iterator<Evidence> iterator() {
    return mReportList.iterator();
  }
}
