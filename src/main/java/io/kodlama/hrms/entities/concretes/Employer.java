package io.kodlama.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {

    @Column(name = "company_name")
    @NotBlank(message = "Şirket adı boş bırakılamaz")
    private String compayName;

    @Column(name = "website")
    @NotBlank(message = "Web sitesi boş bırakılamaz")
    private String website;

    @Column(name = "phone_number")
    @NotBlank(message = "Telefon boş bırakılamaz")
    private String phoneNumber;

    @JsonIgnore
    @Column(name = "is_confirmed")
    private boolean isConfirmed = false;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;
}
