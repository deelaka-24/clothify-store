package model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private String id;
    private String name;
    private String title;
    private String nic;
    private String address;
    private String dateOfBirth;
    private String contact;
    private String accNo;
    private String bankBranch;
}
