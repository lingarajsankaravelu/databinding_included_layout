package com.hourglass.lingaraj.databinding_included_layout;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hourglass.lingaraj.databinding_included_layout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activity_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setData();

    }

    private void setData() {
        //Setting User proflie data over here using Databinding.
        activity_binding.name.setText("Name: Chris Fisher");
        activity_binding.addressContainer.address.setText("Address: 70 Cliff Avenue");
        activity_binding.addressContainer.state.setText("City: Norwich");
        activity_binding.addressContainer.country.setText("Country: England");
        activity_binding.otherContainer.hobby.setText("Hobby : Acting, Board Games");
      }
}
