package dev.acelera.api.controller;

import dev.acelera.api.service.HomeAddressService;
import dev.acelera.api.user.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private HomeAddressService homeAddressService;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRegistrationData data) {
        repository.save(new User(data));
    }

    @GetMapping
    public List<UserDataList> list(){
        return repository.findAll().stream().map(UserDataList::new).toList();
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<UserDataList> findByCpf(@PathVariable String cpf) {
        Optional<User> userOptional = repository.findByCpf(cpf);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            HomeAddress address = homeAddressService.addressCep(user.getCep());
            return ResponseEntity.ok(new UserDataList(user.getId(), user.getNome(), user.getDataNascimento(), user.getCpf(), user.getCep(), address));
        } else {
            return ResponseEntity.notFound().build();
        }
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
