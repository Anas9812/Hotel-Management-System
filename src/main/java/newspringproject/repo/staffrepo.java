package newspringproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import newspringproject.models.staff;

public interface staffrepo extends JpaRepository<staff, Integer> {

}
