package pavel.springframework.sfgpetclinic.services;

import pavel.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
