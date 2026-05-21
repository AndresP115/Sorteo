
package com.registro2.CRUD.repository;

import com.registro2.CRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
