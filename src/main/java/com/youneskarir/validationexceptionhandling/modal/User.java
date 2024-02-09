package com.youneskarir.validationexceptionhandling.modal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(
        name = "utilisatuer",
        uniqueConstraints = @UniqueConstraint(
                name = "email-unique",
                columnNames = "email"
        )
)
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userSequence"
    )
    @SequenceGenerator(
            name = "userSequence",
            sequenceName = "userSequenceId",
            allocationSize = 1
    )
    private Long id;
    private String name;
    private String address;
    private String email;
    private int age;
    private double salary;
}
