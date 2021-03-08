package pavel.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pavel.springframework.sfgpetclinic.model.Owner;
import pavel.springframework.sfgpetclinic.model.Vet;
import pavel.springframework.sfgpetclinic.services.OwnerService;
import pavel.springframework.sfgpetclinic.services.PetService;
import pavel.springframework.sfgpetclinic.services.VetService;

/**
 * Created by Fhoenix on 2021/03/08.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Fhoenix");
        owner1.setLastName("Elderstar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maya");
        owner2.setLastName("Elderstar");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Cassandra");
        vet1.setLastName("Evergreen");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Amala");
        vet2.setLastName("Evergreen");

        vetService.save(vet2);
    }
}
