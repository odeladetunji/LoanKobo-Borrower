package com.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table (name = "group_borrowers")
public class GroupBorrower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "email")
    public String email;

    @Column(name = "password")
    public String password;

    @Column(name = "company_name")
    public String companyName;

    @Column(name = "country")
    public  String country;

    @Column(name = "timezone")
    public String timeZone;

    @Column(name = "currency")
    public  String currency;

    @Column(name = "firstname")
    public String firstName;

    @Column(name = "lastname")
    public String lastName;

    public GroupBorrower() {}
}
