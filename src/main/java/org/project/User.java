package org.project;

public class User {

    private String name;
    private char id;
    private String password;
    private String telephoneNumber;
    private String address;

    public void viewMovies() { }
    public void bookTicket (){ }
    public void cancelTicket() {}
    public void makePayment() {}
    public void addMovieRecords() {}
    public void deleteMovieRecords(){}
    public void updateMovieRecords(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
