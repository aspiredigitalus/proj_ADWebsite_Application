package com.AspireDigital.AspireDigital.PositionJoinVal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PositionJoinVal {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="employee_id")
    private int employeeId;

    @Column(name="position_id")
    private int positionId;

    @Column(name="position_title")
    private String positionTitle;



}
