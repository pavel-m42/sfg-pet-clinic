package pavel.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Fhoenix on 2021/03/06.
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthdDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdDate() {
        return birthdDate;
    }

    public void setBirthdDate(LocalDate birthdDate) {
        this.birthdDate = birthdDate;
    }
}
