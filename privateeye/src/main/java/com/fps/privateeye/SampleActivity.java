package com.fps.privateeye;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SampleActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);

    // plant the private eye on this screen so it can report any findings
    PrivateEye.plant(this);
    attachSampleFragment();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // plant the private eye in the menu so it can report any findings
    PrivateEye.plant(menu, getMenuInflater(), this);
    return true;
  }

  private void attachSampleFragment(){

    final FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment sampleFragment = fragmentManager.findFragmentByTag(SampleFragment.TAG);

    if (sampleFragment == null){
      fragmentManager.beginTransaction()
          .replace(R.id.pi_fragment_frame, new SampleFragment(), SampleFragment.TAG)
          .commit();
    }
  }
}
