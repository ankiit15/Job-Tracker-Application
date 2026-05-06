package com.jobtracker.jobtrackerapplication.entity;

import jakarta.persistence.*;
import com.jobtracker.jobtrackerapplication.entity.Status;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String location;
    private String jobLink;

    private String salary;

    private LocalDate dateApplied;
    private LocalDate interviewDate;

    private String recruiterName;
    private String recruiterEmail;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(length = 2000)
    private String notes;
}