package com.ht.micro.record.commons.domain;

import lombok.Data;

import java.io.Serializable;


@Data
public class User implements Serializable {

    private long userId;
    private String username;
    private String password;

}
