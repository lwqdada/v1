package com.hzxy.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Long id;


    private String username;


    private String password;


    private String email;

    private String phone;
    private Date created;
    private Date updated;
}