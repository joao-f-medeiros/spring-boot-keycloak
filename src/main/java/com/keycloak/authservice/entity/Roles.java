package com.keycloak.authservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_roles")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
