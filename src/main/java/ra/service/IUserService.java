package ra.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import ra.model.User;

public interface IUserService {
    void save(User user);
}
