package pavel.springframework.sfgpetclinic.services;

import pavel.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
