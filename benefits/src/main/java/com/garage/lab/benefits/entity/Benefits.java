package com.garage.lab.benefits.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "benefits")

public class Benefits {

    @Id
    @Column(name="benefits_id")
    private String benefitsId;

    @Column(name="emp_id")
    private String empId;

    @Column(name="description")
    private String description;

    @Column(name="date_start")
    private LocalDateTime dateStart;

    @Column(name="date_end")
    private LocalDateTime dateEnd;
}

