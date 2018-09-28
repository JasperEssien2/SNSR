package com.seamsnstitches.snsr.models;

public class User extends DefaultEntity {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String password;

    private String email;

    private String address;

    private boolean isActivated = false;

    private UserGpsCoordinate userGpsCoordinate;

    private TrouserMeasurement trouserMeasurement;

    private ShirtMeasurement shirtMeasurement;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShirtMeasurement getShirtMeasurement() {
        return shirtMeasurement;
    }

    public void setShirtMeasurement(ShirtMeasurement shirtMeasurement) {
        this.shirtMeasurement = shirtMeasurement;
    }

    public TrouserMeasurement getTrouserMeasurement() {
        return trouserMeasurement;
    }

    public void setTrouserMeasurement(TrouserMeasurement trouserMeasurement) {
        this.trouserMeasurement = trouserMeasurement;
    }

    public boolean isActivated() {

        return isActivated;

    }

    public User setActivated(boolean activated) {

        isActivated = activated;

        return this;

    }

    public UserGpsCoordinate getUserGpsCoordinate() {
        return userGpsCoordinate;
    }

    public User setUserGpsCoordinate(UserGpsCoordinate userGpsCoordinate) {
        this.userGpsCoordinate = userGpsCoordinate;
        return this;
    }
}
