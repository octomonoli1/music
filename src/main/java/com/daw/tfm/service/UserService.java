package com.daw.tfm.service;

import com.daw.tfm.model.entity.Usuario;
import com.daw.tfm.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Usuario> findAll(){
        return this.userRepository.findAll();
    }

    public Optional<Usuario> findOne(int id){
        return this.userRepository.findById(id);
    }

}
