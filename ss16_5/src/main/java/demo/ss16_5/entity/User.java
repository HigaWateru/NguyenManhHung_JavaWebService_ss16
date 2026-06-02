package demo.ss16_5.entity;

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

    @Column(unique = true,
        nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String fullName;

    private String role;

    private boolean enabled;
}