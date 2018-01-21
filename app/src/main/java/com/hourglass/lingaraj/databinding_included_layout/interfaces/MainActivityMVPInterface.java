package com.hourglass.lingaraj.databinding_included_layout.interfaces;

import com.hourglass.lingaraj.databinding_included_layout.HelperModels.UserProfile;

/**
 * Created by lingaraj on 1/21/18.
 */

public interface MainActivityMVPInterface
{
  interface View  {
     void initView();
     void setNewData(UserProfile data);
  }

  interface Model{
    UserProfile getData();
  }

  interface Presenter{
    void onClick(android.view.View view);
}
}
