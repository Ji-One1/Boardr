package ca.mcgill.ecse321.boardr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ca.mcgill.ecse321.boardr.model.GameOwner;

@Repository
public interface GameOwnerRepository extends CrudRepository<GameOwner, Integer> {
}
