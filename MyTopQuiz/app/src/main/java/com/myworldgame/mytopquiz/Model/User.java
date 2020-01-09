package com.myworldgame.mytopquiz.Model;

public class User {
    private String mFirstName;

    public String getFirstName() {
        return mFirstName;
    }

    public static void setFirstName(String FirstName) {
        FirstName = FirstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstName='" + mFirstName + '\'' +
                '}';
    }
}
