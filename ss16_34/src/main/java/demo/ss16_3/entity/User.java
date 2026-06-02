package demo.ss16_3.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
        unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role;

    private boolean enabled = true;
}