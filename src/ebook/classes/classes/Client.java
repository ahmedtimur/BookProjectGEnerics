package ebook.classes.classes;

import ebook.classes.exceptions.NotEnoughMoneyException;

import java.util.*;


public class Client {
    private String clientName, clientEmail;
    private Set<Book<?>> likedBooks, boughtBooks;
    private double balance;

    public Client(String clientName, String clientEmail, double balance) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.likedBooks = new HashSet<>();
        this.boughtBooks = new HashSet<>();
        this.balance = checkBalance(balance);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Set<Book<?>> getLikedBooks() {
        return likedBooks;
    }

    public void setLikedBooks(Set<Book<?>> likedBooks) {
        this.likedBooks = likedBooks;
    }

    public Set<Book<?>> getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(Set<Book<?>> boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String   toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", likedBooks=" + likedBooks +
                ", boughtBooks=" + boughtBooks +
                '}';
    }
    private void checkBalance() {
        try {
            if (getBalance() < 0) {
                throw new NotEnoughMoneyException();
            }
        }
        catch (NotEnoughMoneyException e) {
            System.err.println("You don't have enough money to buy the book");
        }
    }

    public void likedBookMethod(Book<?> book) {
        this.likedBooks.add(book);
    }

    public void dislikedBook(Book<?> book) {
        this.likedBooks.remove(book);
    }

    public void buyABook(Book<?> book) {
        this.boughtBooks.add(book);
    }
}
