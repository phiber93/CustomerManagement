package at.phiber93.CustomerManagement.address;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @PostMapping
    public Address saveAddress(
            @RequestBody Address address) {
        return addressRepository.save(address);
    }

    @GetMapping
    public List<Address> findAllAddresses (){
        return addressRepository.findAll();
    }

}
