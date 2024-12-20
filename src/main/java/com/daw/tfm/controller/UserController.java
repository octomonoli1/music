package com.daw.tfm.controller;

import com.daw.tfm.model.entity.Usuario;
import com.daw.tfm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    private List<Usuario> getAll(){
        System.out.println("ENTRA");
        return this.userService.findAll();
    }

    @GetMapping("/{id}")
    private ResponseEntity<Usuario> getOne(@PathVariable(name = "id") int id){
        return this.userService.findOne(id).map(ResponseEntity::ok).orElse(null);
    }
}
