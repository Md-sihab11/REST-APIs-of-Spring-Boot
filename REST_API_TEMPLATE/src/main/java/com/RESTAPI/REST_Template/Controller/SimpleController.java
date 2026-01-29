package com.RESTAPI.REST_Template.Controller;


import com.RESTAPI.REST_Template.Model.User;
import com.RESTAPI.REST_Template.Service.IMPL.Serviceimple;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class SimpleController {

    private final Serviceimple userService;

    public SimpleController(Serviceimple userService) {
        this.userService = userService;
    }

    // ADD USER
    @PostMapping("/add")
    public User addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }

    // GET USER
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    // UPDATE USER
    @PutMapping("/update/{id}")
    public User updateUser(
            @PathVariable Long id,
            @Valid @RequestBody User user
    ) {
        return userService.updateUser(id, user);
    }

    // DELETE USER
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
