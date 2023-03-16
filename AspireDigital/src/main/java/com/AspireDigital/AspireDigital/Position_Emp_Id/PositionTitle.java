package com.AspireDigital.AspireDigital.Position_Emp_Id;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PositionTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROWID")
    String rowid;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "position_title")
    private String positionTitle;
}