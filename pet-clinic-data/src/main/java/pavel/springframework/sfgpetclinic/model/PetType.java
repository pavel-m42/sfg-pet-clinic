package pavel.springframework.sfgpetclinic.model;

/**
 * Created by Fhoenix on 2021/03/06.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
