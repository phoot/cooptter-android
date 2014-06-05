package com.github.lbroudoux.cooptter;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
   /**
    * Called when the activity is first created.
    */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      ActionBar actionBar = getActionBar();
      actionBar.setDisplayHomeAsUpEnabled(false);
   }

}
