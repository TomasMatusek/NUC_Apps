package tmxlab.homelab.users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository userRepository;

    public UsersService(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}