package com.AspireDigital.AspireDigital.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="middle_init")
    private String middleInit;

    @Column(name="region")
    private String region;

    @Column(name="profile_loc")
    private String profileLoc;

    @Column(name="linkedin_loc")
    private String linkedIn;

    @Column(name="active")
    private Boolean active = true;

    @Column(name="date_created")
    private Date dateCreated = new Date();

    @Column(name="date_deactivated")
    private Date dateDeactivated;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="deactivated_by")
    private String deactivatedBy;


}
