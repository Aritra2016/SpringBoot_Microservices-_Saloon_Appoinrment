package com.aritra.user.service.UserService.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="micro_users")
public class User {

    //Columns or, Fields of User Table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userid;


    private String fullName;


    private String email;

    private String phone;


    private String role;

    @Column(name= "Created_At")
    private LocalDateTime createdAt;

    @Column(name= "Updated_At")
    private LocalDateTime updatedAt;

}
