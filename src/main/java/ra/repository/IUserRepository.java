package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ra.model.User;

public interface IUserRepository extends PagingAndSortingRepository<User,Long> {
}
