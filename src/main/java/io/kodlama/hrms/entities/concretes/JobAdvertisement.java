package io.kodlama.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;


@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "description")
    private String description;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "open_position_count")
    private int openPositionCount;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(name = "creation_date")
    @CreationTimestamp
    private Date creationDate;// = new Date(System.currentTimeMillis());

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
