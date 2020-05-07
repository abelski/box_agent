package by.abelski.boxagent.entities;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class User {

    private String id;

    private String username;

    private String password;

    private String phone;

    private String email;


    private Set<Role> roles = new HashSet<>();




}
