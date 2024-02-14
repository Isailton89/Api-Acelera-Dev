package dev.acelera.api.controller;

import dev.acelera.api.user.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRegistrationData data) {
        repository.save(new User(data));
    }

    @GetMapping
    public List<UserDataList> list(){
        return repository.findAll().stream().map(UserDataList::new).toList();
    }

    @PutMapping
    @Transactional
    public void updateUser(@RequestBody UserUpdateData data) {
        var user = repository.getReferenceById(data.id());
        user.updateData(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
