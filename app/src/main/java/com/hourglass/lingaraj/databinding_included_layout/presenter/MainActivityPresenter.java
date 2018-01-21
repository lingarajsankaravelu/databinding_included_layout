package com.hourglass.lingaraj.databinding_included_layout.presenter;

import android.view.View;
import com.hourglass.lingaraj.databinding_included_layout.R;
import com.hourglass.lingaraj.databinding_included_layout.interfaces.MainActivityMVPInterface;
import com.hourglass.lingaraj.databinding_included_layout.model.MainActivityModel;
import com.hourglass.lingaraj.databinding_included_layout.view.MainActivity;

/**
 * Created by lingaraj on 1/21/18.
 */

public class MainActivityPresenter  implements MainActivityMVPInterface.Presenter{

  private MainActivity activity_view;
  private MainActivityModel mModel;

  public MainActivityPresenter(MainActivity view){
    activity_view = view;
    initPresenter();

  }

  private void initPresenter() {
    mModel = new MainActivityModel();

  }

  @Override public void onClick(View view) {
    switch (view.getId()){
      case R.id.button_click:
         //handles button click
         // gets data from respective model and populate the data to the view using activity view method
        activity_view.setNewData(mModel.getData());
         break;
       default:
         break;

    }
  }
}
