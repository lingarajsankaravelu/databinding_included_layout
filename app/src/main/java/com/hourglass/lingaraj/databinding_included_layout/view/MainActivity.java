package com.hourglass.lingaraj.databinding_included_layout.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import com.hourglass.lingaraj.databinding_included_layout.HelperModels.UserProfile;
import com.hourglass.lingaraj.databinding_included_layout.R;
import com.hourglass.lingaraj.databinding_included_layout.databinding.ActivityMainBinding;
import com.hourglass.lingaraj.databinding_included_layout.interfaces.MainActivityMVPInterface;
import com.hourglass.lingaraj.databinding_included_layout.presenter.MainActivityPresenter;

//Complete implementation of mvc architecture in code.
// model handles all buisness logic - like what data to get,generate, what api calls to make
// presenter speaks to both model and view
// view handles the clicks and talk to presenter
public class MainActivity extends AppCompatActivity implements MainActivityMVPInterface.View{

    private ActivityMainBinding activity_binding;
    private MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        presenter = new MainActivityPresenter(this);

    }


    public void handleButtonClick(View view) {
        //handles whatever the click that happens inside and pass it to the presenter , presenter will take care of respective click datas
        presenter.onClick(view);
    }

    @Override
    public void initView() {
    }

    @Override
    public void setNewData(UserProfile profile) {
        //Setting User proflie data over here using Databinding.
        activity_binding.name.setText(profile.getName());
        activity_binding.name.setVisibility(View.VISIBLE);
        activity_binding.addressContainer.address.setText(profile.getAddress());
        activity_binding.addressContainer.address.setVisibility(View.VISIBLE);
        activity_binding.addressContainer.state.setText(profile.getState());
        activity_binding.addressContainer.state.setVisibility(View.VISIBLE);
        activity_binding.addressContainer.country.setText(profile.getCountry());
        activity_binding.addressContainer.country.setVisibility(View.VISIBLE);
        activity_binding.otherContainer.hobby.setText(profile.getHobby());
        activity_binding.otherContainer.hobby.setVisibility(View.VISIBLE);

    }
}
