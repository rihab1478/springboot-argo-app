package spring_boot_app.app.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import spring_boot_app.app.entity.User;
import spring_boot_app.app.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/hello")
    public String hello() {
        return "this is a spring boot + postgress app with helm deployed with argocd ";
    }
}