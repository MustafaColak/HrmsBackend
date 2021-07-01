package io.kodlama.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends User {

    @Column(name = "first_name")
    @NotBlank(message = "Ad alanı boş bırakılamaz")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Soyad alanı boş bırakılamaz")
    private String lastName;

    @Column(name = "identity_number")
    @NotBlank(message = "Kimlik numarası alanı boş bırakılamaz")
    //@Size(min = 11, max=11, message = "TCKimlik No 11 hane olmalıdır")
    private String identityNumber;

    @Column(name = "year_of_birth")
    @NotBlank(message = "Doğum yılı alanı boş bırakılamaz")
    private String yearOfBirth;
}
