package com.eslam.mye_commerce.Model;

public class UserModel {
    String id;
    String name;
    String email;
    String password;
    String phone;
    String profileImg;
    String confirm;
    private String address;

    public UserModel(String id, String name, String email, String password, String phone, String profileImg, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.profileImg = profileImg;
        this.address = address;
    }

    public UserModel() {
    }

    public UserModel(String id, String name, String email, String password, String phone, String confirm) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.confirm = confirm;
    }

    public UserModel(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public UserModel(String id, String nme, String emil, String phone, String pssword) {
        this.id = id;
        this.name = nme;
        this.email = emil;
        this.password = pssword;
        this.phone = phone;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }


}
