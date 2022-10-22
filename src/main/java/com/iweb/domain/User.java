package com.iweb.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class User implements Serializable {
    private String username;
    private String password;
    private String gender;
    private String[] hobby;
    private String province;
    private String intro;
    private Integer age;
    private Boolean married;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", province='" + province + '\'' +
                ", intro='" + intro + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(hobby, user.hobby)) return false;
        if (province != null ? !province.equals(user.province) : user.province != null) return false;
        if (intro != null ? !intro.equals(user.intro) : user.intro != null) return false;
        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        if (married != null ? !married.equals(user.married) : user.married != null) return false;
        return birthday != null ? birthday.equals(user.birthday) : user.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(hobby);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (married != null ? married.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String username, String password, String gender, String[] hobby, String province, String intro, Integer age, Boolean married, Date birthday) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
        this.province = province;
        this.intro = intro;
        this.age = age;
        this.married = married;
        this.birthday = birthday;
    }
}
