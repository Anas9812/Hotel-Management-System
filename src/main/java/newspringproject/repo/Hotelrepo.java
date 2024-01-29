package newspringproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import newspringproject.models.hotelmodels;

@Repository
public interface Hotelrepo extends JpaRepository<hotelmodels , Integer>{

	
	public List<hotelmodels> findByName(String name);      // Custom Method 
	
	

	
	
}
