package pavel.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Fhoenix on 2021/03/07.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
