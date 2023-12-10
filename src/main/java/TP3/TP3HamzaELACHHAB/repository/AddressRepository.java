package TP3.TP3HamzaELACHHAB.repository;

import TP3.TP3HamzaELACHHAB.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {
}
