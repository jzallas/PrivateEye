package com.fps.privateeye.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fps.privateeye.R;
import com.fps.privateeye.viewmodel.BaseViewHolder;
import com.fps.privateeye.viewmodel.ReportViewHolder;
import com.fps.privateeye.viewmodel.ReportViewModel;

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

  //region FAKEDATA
  // TODO: 1/2/16 remove fake data
  public ReportListAdapter() {
    mDataSet = new ArrayList<>();

    mDataSet.add(new ReportViewModel.Builder()
        .setTitle("TITLE ONE")
        .setSubtitle("SUBTITLE ONE")
        .setDescription(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sit amet leo gravida, facilisis purus sit amet, placerat felis. Nulla eget elit ipsum. Nulla bibendum odio quam, quis pulvinar risus venenatis a. Donec quis hendrerit leo. Donec dignissim auctor vestibulum. Ut eu lacinia enim. Morbi tincidunt augue ut lectus commodo tristique. Nam sit amet justo mollis, accumsan arcu vel, pulvinar leo. Integer varius enim nunc, quis interdum tellus scelerisque a. Quisque sed lectus finibus arcu gravida viverra sed ut elit. Pellentesque est diam, porta pretium pulvinar quis, fermentum sit amet risus.")
        .build());

    mDataSet.add(new ReportViewModel.Builder()
        .setTitle("TITLE TWO")
        .setSubtitle("SUBTITLE TWO")
        .setDescription(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam turpis nibh, maximus eget interdum tincidunt, tempor at justo. Nulla facilisi. Nulla consequat porttitor libero a tincidunt. Etiam congue, dui ultricies placerat ultricies, quam tellus scelerisque felis, sed tempor neque purus vel ligula. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas egestas turpis non neque porttitor, ac suscipit velit convallis. Integer congue dignissim hendrerit. Pellentesque ultrices mauris nec velit posuere semper. Nunc lacus enim, dictum eu magna sed, viverra ornare velit. Morbi sagittis erat nisi, ac lacinia augue pellentesque at. Nunc elementum, justo sit amet congue eleifend, libero odio vulputate nisi, ut fringilla erat magna ac lorem. Aliquam pretium placerat vulputate. Integer eget elit vel augue eleifend aliquam. Mauris commodo volutpat rutrum.")
        .build());

    mDataSet.add(new ReportViewModel.Builder()
        .setTitle("TITLE THREE")
        .setSubtitle("SUBTITLE THREE")
        .setDescription(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque augue nisl, tincidunt et ornare quis, malesuada eget est. Aenean nec elit vitae velit mattis feugiat eget fermentum odio. Phasellus vehicula lacinia dignissim. Curabitur et sapien non risus gravida gravida. Quisque consequat pretium ultrices. Duis sed viverra ante, at suscipit ligula. Morbi ut arcu laoreet metus fringilla volutpat. Sed mattis auctor nibh quis iaculis. Aenean tortor erat, faucibus a dictum in, suscipit convallis quam. Mauris faucibus est in sapien egestas, vel auctor libero viverra. In et varius sapien, convallis lobortis erat. Nullam placerat ut tellus vitae lacinia. Donec convallis consequat velit. Phasellus sed mattis metus. Curabitur eros mauris, volutpat quis vulputate vitae, sollicitudin feugiat nibh.")
        .build());

    mDataSet.add(new ReportViewModel.Builder()
        .setTitle("TITLE FOUR")
        .setSubtitle("SUBTITLE FOUR")
        .setDescription(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla non dictum augue, vitae lobortis erat. Nullam lacinia sodales augue. Morbi in erat id felis aliquet sagittis ut sed nulla. Proin rutrum, elit sed viverra bibendum, ex dolor efficitur velit, non eleifend velit lectus quis odio. Integer aliquam velit nec venenatis scelerisque. Fusce non lectus a velit volutpat congue. Vivamus vitae libero urna. Nam efficitur pharetra nunc eget efficitur. Suspendisse non velit at libero venenatis feugiat quis sed turpis. Curabitur id mi orci. Maecenas convallis turpis augue, id rutrum arcu suscipit quis. Praesent vel mi turpis. Sed non metus interdum, suscipit metus at, laoreet lorem.")
        .build());

    mDataSet.add(new ReportViewModel.Builder()
        .setTitle("TITLE FIVE")
        .setSubtitle("SUBTITLE FIVE")
        .setDescription(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque tempus erat id urna ultrices dignissim. Pellentesque non tempus tortor, non imperdiet lacus. Praesent sagittis neque eget lorem aliquam tincidunt. Donec quis nunc id nulla gravida tincidunt hendrerit vitae lacus. Maecenas molestie lectus nisi, vitae hendrerit dolor placerat vel. Nulla consequat non lorem vitae imperdiet. Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed fringilla varius nulla et molestie. Curabitur efficitur tempus imperdiet. Praesent dapibus, leo et convallis aliquet, nulla justo pellentesque nunc, vitae vulputate justo erat sed nunc. Etiam id neque eu enim mollis tristique ut at leo. Phasellus diam eros, lobortis a nisi sit amet, efficitur malesuada magna. Vivamus tincidunt diam laoreet consectetur egestas. Ut in egestas massa. Proin eget laoreet diam. Curabitur lobortis justo sed tincidunt dictum.")
        .build());
  }

  //endregion
}
