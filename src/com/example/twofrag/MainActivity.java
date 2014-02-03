package com.example.twofrag;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.view.WindowManager;

public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      Configuration config = getResources().getConfiguration();

      FragmentManager fragmentManager = getFragmentManager();
      FragmentTransaction fragmentTransaction = 
      fragmentManager.beginTransaction();

      /**
      * Check the device orientation and act accordingly
      */
      if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
         /**
         * Landscape mode of the device
         */
         landscapeFragment ls_fragment = new landscapeFragment();
         fragmentTransaction.replace(android.R.id.content, ls_fragment);
      }else{
         /**
         * Portrait mode of the device
         */
         portraitFragment pm_fragment = new portraitFragment();
         fragmentTransaction.replace(android.R.id.content, pm_fragment);
      }
      fragmentTransaction.commit();
   }
    
}