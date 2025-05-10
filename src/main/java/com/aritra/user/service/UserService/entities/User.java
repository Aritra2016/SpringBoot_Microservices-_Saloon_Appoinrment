package com.aritra.user.service.UserService.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column (name="ID")
    private String userId;

    @Column(name="NAME")
    private String fullName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT")
    private String phone;

    @Column(name= "ROLE")
    private String role;

    @Column(name= "Created_At")
    private LocalDateTime createdAt;

    @Column(name= "Updated_At")
    private LocalDateTime updatedAt;

}
