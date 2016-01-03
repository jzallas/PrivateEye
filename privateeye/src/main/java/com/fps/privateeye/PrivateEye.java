package com.fps.privateeye;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class PrivateEye {

  private static PrivateEye sInstance;

  public static PrivateEye getInstance() {
    if (sInstance == null) {
      synchronized (PrivateEye.class) {
        if (sInstance == null) {
          sInstance = new PrivateEye();
        }
      }
    }
    return sInstance;
  }

  /**
   * Attempt to plant the reporter on a {@link Activity}'s root layout. If the root layout
   * cannot be found or is not available, nothing will be planted.
   *
   * @param activity the {@link Activity} where the reporter will be planted.
   */
  public static void plant(Activity activity) {
    if (activity == null) {
      return;
    }
    ViewGroup rootView = (ViewGroup) activity.getWindow().getDecorView()
        .findViewById(android.R.id.content);

    attachToViewGroup(rootView);
  }

  /**
   * Attempt to plant the reporter as a {@link MenuItem} within a {@link Menu}. If the menu is not
   * available, nothing will be planted.
   *
   * @param menu     the {@link Menu} where the reporter will be planted.
   * @param inflater {@link MenuInflater} used to create a reporter menu item
   * @param context  the {@link Context} where the menu item will exist
   */
  public static void plant(Menu menu, MenuInflater inflater, Context context) {
    attachToMenu(menu, inflater, context);
  }

  /**
   * Attempt to plant the reporter on a {@link android.app.Fragment}'s root layout. If the root
   * layout
   * cannot be found or is not available, nothing will be planted.
   *
   * @param fragment the {@link android.app.Fragment} where the reporter will be planted.
   */
  public static void plant(android.app.Fragment fragment) {
    if (fragment == null) {
      return;
    }

    plant(fragment.getActivity());
  }

  /**
   * Attempt to plant the reporter on a {@link android.support.v4.app.Fragment}'s root layout. If
   * the root layout
   * cannot be found or is not available, nothing will be planted.
   *
   * @param fragment the {@link android.support.v4.app.Fragment} where the reporter will be
   *                 planted.
   */
  public static void plant(android.support.v4.app.Fragment fragment) {
    if (fragment == null) {
      return;
    }

    plant(fragment.getActivity());
  }


  private static void attachToMenu(Menu menu, MenuInflater inflater, final Context context) {
    MenuItem investigateMenuItem = menu.findItem(R.id.pi_action_investigate);
    if (investigateMenuItem == null) {
      inflater.inflate(R.menu.menu_pi_investigate, menu);
      investigateMenuItem = menu.findItem(R.id.pi_action_investigate);
    }

    investigateMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(MenuItem item) {
        showReport(context);
        return true;
      }
    });
  }

  private static void attachToViewGroup(ViewGroup viewGroup) {
    if (viewGroup != null && viewGroup.findViewById(R.id.pi_investigate_button) == null) {
      attachInvestigateButton(viewGroup);
    }
  }

  private static void attachInvestigateButton(ViewGroup viewGroup) {
    final View investigateButton = createInvestigateButton(viewGroup);
    investigateButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showReport(v.getContext());
      }
    });
    viewGroup.addView(investigateButton);
  }

  private static View createInvestigateButton(ViewGroup viewGroup) {
    return LayoutInflater.from(viewGroup.getContext())
        .inflate(R.layout.widget_investigate_button, viewGroup, false);
  }

  private static void showReport(Context context) {
    //// TODO: 1/2/16 Launch Actual Report
    Toast.makeText(context, "Investigating", Toast.LENGTH_SHORT).show();
  }
}
