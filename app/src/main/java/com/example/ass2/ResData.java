package com.example.ass2;

public class ResData {

    private String name;
    private String cuisine;
    private String rating;
    private String location;
    private int image;

    //Use the "this." keyword to refer to the current instance of the method used.

    public ResData(String name, String cuisine, String rating, String location, int image) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        this.location = location;
        this.image = image;
    }

    //creating getters and setters for my variables so that they can be called upon in other
    //classes. Getters and setters are used to protect the values stored in my variables, and ensure
    //any updates do not affect the original value.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }



}
