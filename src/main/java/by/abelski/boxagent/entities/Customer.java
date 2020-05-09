package by.abelski.boxagent.entities;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    @Id
    private String id;
    private List<Place> myPlaces = new ArrayList<>();
    private UserType userType;
}
