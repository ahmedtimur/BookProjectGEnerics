package ebook.classes.classes;

import ebook.classes.interfaces.BookType;

import java.util.List;
import java.util.Set;

public class Vendor {
    private String vendorName, vendorEmail, phoneNumber;
    private Set<Book<?>> bookToSale;

    public Vendor(String vendorName, String vendorEmail, String phoneNumber, Set<Book<?>> bookToSale) {
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.phoneNumber = phoneNumber;
        this.bookToSale = bookToSale;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Book<?>> getBookToSale() {
        return bookToSale;
    }

    public void setBookToSale(Set<Book<?>> bookToSale) {
        this.bookToSale = bookToSale;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorName='" + vendorName + '\'' +
                ", vendorEmail='" + vendorEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bookToSale=" + bookToSale +
                '}';
    }
}
