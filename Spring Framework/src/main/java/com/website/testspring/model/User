package com.website.testspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
        "Name",
        "Age",
        "Email"
})
public class User {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Age")
    private int age;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Age")
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }
}
