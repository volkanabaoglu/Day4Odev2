package com.company;

public class Customer implements CustomerService {
    int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String firstName;
    String lastName;
    String dateTime;
    String nationalityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }


    @Override
    public void save(Customer customer) {

    }
}
