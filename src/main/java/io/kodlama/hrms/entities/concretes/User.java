package io.kodlama.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @NotBlank(message = "Mail alanı boş bırakılamaz")
    @Email(message = "E-mail geçerli olmalıdır")
    private String email;

    @Column(name = "password")
    @NotBlank(message = "Şifre alanı boş bırakılamaz")
    private String password;
}
