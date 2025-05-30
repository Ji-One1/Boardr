package ca.mcgill.ecse321.boardr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ca.mcgill.ecse321.boardr.model.Review;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    public Review findByReviewId(int id);
    List<Review> findByBoardGameGameIdOrderByReviewDateDesc(int gameId);


}
