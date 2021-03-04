package com.javaprogram.AddressBook;

public class InformationInput {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String emailId;

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String getCity()
    {
        return city;
    }

    public void setState(String state)
    {
        this.state=state;
    }

    public String getState()
    {
        return state;
    }

    public void setZip(String zip)
    {
        this.zip=zip;
    }

    public String getZip()
    {
        return zip;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setEmailId(String emailId)
    {
        this.emailId=emailId;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void copy(InformationInput temp)
    {
        this.address=temp.address;
        this.firstName=temp.firstName;
        this.lastName=temp.lastName;
        this.city=temp.city;
        this.state=temp.state;
        this.zip=temp.zip;
        this.phoneNumber=temp.phoneNumber;
        this.emailId=temp.emailId;
    }

    public String toString() {
        return "InformationInput [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phone=" + phoneNumber + ", emailId=" + emailId +"]";
    }

}
