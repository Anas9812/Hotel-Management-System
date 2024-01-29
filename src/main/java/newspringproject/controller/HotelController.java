package newspringproject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import newspringproject.models.hotelmodels;
import newspringproject.service.HotelINF;

@RestController
@RequestMapping("/hotel")
@CrossOrigin("*")
public class HotelController {

	@Autowired
	HotelINF service;
	

	@PostMapping("/save")
	public String Savehotel(@RequestBody @Valid hotelmodels hotel) {
		return service.Savehotel(hotel);
				
	}
	
	@GetMapping("/fetch")
	public  ResponseEntity<List<hotelmodels>> fetchhotel(@RequestParam ("PageNumber") int PageNumber, @RequestParam ("PageSize") int PageSize) {
		return ResponseEntity.status(HttpStatus.OK).body(service.fetchhotel(PageNumber, PageSize));
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<hotelmodels>> getAlldata() {
//		userservice.saveuser(u);
		return  ResponseEntity.status(HttpStatus.OK).body(service.getAlldatas());
	}

	// findByName Custom Method
	@GetMapping("/fetch/{name}")
	public List<hotelmodels> findByName(@PathVariable String name) {
		return service.findByName(name);
	}

	@DeleteMapping("/delete/{id}")
	public List<hotelmodels> deletehotel(@PathVariable int id) {
		return service.deletehotel(id);
	}

	@PutMapping("/update")
	public hotelmodels updatehotel(@RequestBody hotelmodels hotel) {
		return service.updatehotel(hotel);
	}
	
	
	

}
