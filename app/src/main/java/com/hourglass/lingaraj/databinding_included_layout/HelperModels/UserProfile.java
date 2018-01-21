package com.hourglass.lingaraj.databinding_included_layout.HelperModels;

/**
 * Created by lingaraj on 1/21/18.
 */

public class UserProfile {

  private String name;
  private String address;
  private String city;
  private String country;
  private String hobby;
  private String State;

  public UserProfile(){
     this.name = "Name: Chris Fisher";
     this.address = "Address: 70 Cliff Avenue";
     this.city = "City: Norwich";
     this.State = "State: Manchester";
     this.country = "Country: England";
     this.hobby = "Hobby : Acting, Board Games";
  }

  public String getHobby() {
    return hobby;
  }

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }

  public String getAddress() {
    return address;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return State;
  }
}
