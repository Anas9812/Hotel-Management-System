package newspringproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import newspringproject.models.user;

@Repository
public interface userrepo extends JpaRepository<user,Long> {

	public user findByUsername (String username);
	
}
