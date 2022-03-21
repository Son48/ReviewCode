package com.example.transferapplication.activity_activity;

import android.os.Parcel;
import android.os.Parcelable;


public class User implements Parcelable {
    private int img;
    private String name;
    private String adress;

    public User() {
    }

    public User(int img, String name, String adress) {
        this.img = img;
        this.name = name;
        this.adress = adress;
    }

    protected User(Parcel in) {
        img = in.readInt();
        name = in.readString();
        adress = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img);
        dest.writeString(name);
        dest.writeString(adress);
    }
}
