package com.fps.privateeye.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fps.privateeye.R;
import com.fps.privateeye.evidence.Evidence;
import com.fps.privateeye.evidence.EvidenceStore;
import com.fps.privateeye.ui.viewmodel.BaseViewHolder;
import com.fps.privateeye.ui.viewmodel.ReportViewHolder;
import com.fps.privateeye.ui.viewmodel.ReportViewModel;

import java.util.ArrayList;
import java.util.List;

public class ReportListAdapter extends RecyclerView.Adapter<BaseViewHolder<ReportViewModel>> {

  private List<ReportViewModel> mDataSet;

  @Override
  public BaseViewHolder<ReportViewModel> onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.list_item_report, parent, false);
    return new ReportViewHolder(view);
  }

  @Override
  public void onBindViewHolder(BaseViewHolder<ReportViewModel> holder, int position) {
    holder.bindView(getItem(position));
  }

  private ReportViewModel getItem(int pos) {
    return mDataSet == null ? null : mDataSet.get(pos);
  }

  @Override
  public int getItemCount() {
    return mDataSet == null ? 0 : mDataSet.size();
  }

  public ReportListAdapter(EvidenceStore evidenceStore) {
    mDataSet = createViewModels(evidenceStore);
  }

  private List<ReportViewModel> createViewModels(EvidenceStore evidenceStore) {

    final List<ReportViewModel> viewModels = new ArrayList<>();

    for (Evidence report : evidenceStore) {
      viewModels.add(createViewModel(report));
    }

    return viewModels;
  }

  private ReportViewModel createViewModel(Evidence report) {
    return new ReportViewModel.Builder()
        .setTitle(report.getTitle())
        .setSubtitle(report.getSubtitle())
        .setDescription(report.getDescription())
        .setIconDrawable(report.getIconDrawable())
        .setBackgroundColor(report.getBackgroundColor())
        .build();
  }
}
