package pavel.springframework.sfgpetclinic.services;

import pavel.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
