package newspringproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import newspringproject.models.user;
import newspringproject.repo.userrepo;

@Service
public class MyuserService implements UserDetailsService{

	@Autowired
	userrepo repo;
	
	@Autowired
	PasswordEncoder encoder;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repo.findByUsername(username);
	}
	
	public user saveuser(user U) {
		U.setPasscode(encoder.encode(U.getPasscode()));
		repo.save(U);
		return repo.findByUsername(U.getUsername());
	}

}
