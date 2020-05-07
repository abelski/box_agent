package by.abelski.boxagent.entities;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data

public class User {

    private String id;

    private String username;

    private String password;


    private String passwordConfirm;

    private Set<Role> roles = new HashSet<>();




}
