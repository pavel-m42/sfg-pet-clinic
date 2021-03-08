package pavel.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pavel.springframework.sfgpetclinic.model.Pet;
import pavel.springframework.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
@Service
public class PetServiceMap  extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
