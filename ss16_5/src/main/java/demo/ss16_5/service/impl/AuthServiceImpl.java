package demo.ss16_5.service.impl;

import demo.ss16_5.dto.RegisterRequest;
import demo.ss16_5.entity.User;
import demo.ss16_5.repository.UserRepository;
import demo.ss16_5.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) throw new IllegalArgumentException("Username đã tồn tại!");

        User user = User.builder().username(request.getUsername()).fullName(request.getFullName())
            .password(passwordEncoder.encode(request.getPassword())).role("USER").enabled(true).build();
        userRepository.save(user);
    }
}