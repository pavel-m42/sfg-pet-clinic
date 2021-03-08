package pavel.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pavel.springframework.sfgpetclinic.model.Vet;
import pavel.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
@Service
public class VetServiceMap  extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
