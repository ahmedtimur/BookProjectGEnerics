package ebook.classes.classes;

import ebook.classes.interfaces.BookType;

public class PaperBook implements BookType {
    private String fragment, publishingHouse;
    private int pageSize;

    public PaperBook(String fragment, String publishingHouse, int pageSize) {
        this.fragment = fragment;
        this.publishingHouse = publishingHouse;
        this.pageSize = pageSize;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "fragment='" + fragment + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", pageSize=" + pageSize +
                '}';
    }
}
