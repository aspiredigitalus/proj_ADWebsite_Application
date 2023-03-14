package com.AspireDigital.AspireDigital.Position_Emp_Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class PositionEmpId {

    @Id
    @Column(name="employee_id")
    private int employeeId;


    @Column(name="position_id")
    private String positionId;
}
