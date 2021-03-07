package pavel.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
