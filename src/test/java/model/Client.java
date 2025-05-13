package model;

import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private String phone;
    private Address address;


    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printClientDetails() {
        System.out.println("CLient name: " + getFullName() + ", " + "Client address: " + getClientAddress() +
                ", " + "Phone nr: " + getPhone());

    }

    public String getClientAddress() {
        return address.getCity() + ", " + address.getStreet() + " " + address.getHouseNr();

    }



}
