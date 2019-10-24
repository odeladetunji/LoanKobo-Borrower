package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupBorrower {

    @JsonProperty("Email")
    public String email;

    @JsonProperty("Password")
    public String password;

    @JsonProperty("CompanyName")
    public String companyName;

    @JsonProperty("Country")
    public  String country;

    @JsonProperty("TimeZone")
    public String timeZone;

    @JsonProperty("Currency")
    public  String currency;

    @JsonProperty("FirstName")
    public String firstName;

    @JsonProperty("LastName")
    public String lastName;


}
