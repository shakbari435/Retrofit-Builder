package com.phoenixdevs.retrofit.Retrofit;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Users implements Serializable {


    @SerializedName("ID")
    private String id;

    @SerializedName("NAME")
    private String name;

    @SerializedName("FAMILY")
    private String family;



    public Users() {

    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
