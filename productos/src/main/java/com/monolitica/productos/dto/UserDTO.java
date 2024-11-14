package com.monolitica.productos.dto;


public class UserDTO {
    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String username;
    private String password;
    private Long productId;

    public UserDTO(Long id, String name, String lastname, String address, String username, String password, Long productId) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.username = username;
        this.password = password;
        this.productId = productId;
    }

    public UserDTO() {
    }

    public Long getId() {
        return id;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}