package by.abelski.boxagent.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class CompanyCustomer extends Customer {
    private int startWorkingHour;
    private int endWorkingHour;
    private List<Day> workingDays;
}
