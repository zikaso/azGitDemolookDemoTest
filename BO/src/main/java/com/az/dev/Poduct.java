package com.az.dev;

public class Poduct {

    private Long id;
    private String name;
    private String tel;
    private String email;

    public Long getId() {
        return id;
    }

    public Poduct(Long id, String name, String tel, String email) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
