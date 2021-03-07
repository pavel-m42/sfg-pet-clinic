package pavel.springframework.sfgpetclinic.services;

import pavel.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
