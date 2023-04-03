package com.AspireDigital.AspireDigital.Employee;
import  jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name="id")
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

    @Column(name="active", columnDefinition="BIT")
    private Boolean active;


}
