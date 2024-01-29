package newspringproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import newspringproject.models.Room;

public interface Roomrepo extends JpaRepository<Room, Integer>{

}
