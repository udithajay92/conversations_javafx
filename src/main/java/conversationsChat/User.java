package main.java.conversationsChat;

import java.io.Serializable;

/**
 * Created by uditha on 3/4/2017.
 */
public class User implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    String picture;
    Status status;
}
