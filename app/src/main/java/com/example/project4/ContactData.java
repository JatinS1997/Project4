package com.example.project4;

public class ContactData {


    private String Name;
    private String Title;
    private int Photo;


    public ContactData(){


    }

    public ContactData(String name, String title, int photo) {
        Name = name;
        Title = title;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getTitle() {
        return Title;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
