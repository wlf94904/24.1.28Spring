package com.itheima.pojo;

import com.sun.jndi.cosnaming.IiopUrl;

import java.util.Arrays;
import java.util.Date;

/**
 * @author hhm
 * @version 1.0
 */
public class User {
    private String username;
    private Integer age;
    private String[] hobbies;
    private Date birthday;
    private Address address;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public Integer getAge(){
        return age;
    }

    public void setHobbies(String[] hobbies){
        this.hobbies=hobbies;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(){
        this.birthday=birthday;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address=address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
