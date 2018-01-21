package com.hourglass.lingaraj.databinding_included_layout.model;

import com.hourglass.lingaraj.databinding_included_layout.HelperModels.UserProfile;
import com.hourglass.lingaraj.databinding_included_layout.interfaces.MainActivityMVPInterface;

/**
 * Created by lingaraj on 1/21/18.
 */

public class MainActivityModel implements MainActivityMVPInterface.Model {

  @Override
  public UserProfile getData() {
    return new UserProfile();
  }

}
