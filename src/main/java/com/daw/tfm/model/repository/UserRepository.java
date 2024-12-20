package com.daw.tfm.model.repository;

import com.daw.tfm.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
