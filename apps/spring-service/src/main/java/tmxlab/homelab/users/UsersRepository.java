package tmxlab.homelab.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    // findAll(), findById(), save(), delete() máš zadarmo
}