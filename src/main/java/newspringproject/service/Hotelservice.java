package newspringproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import newspringproject.exception.UserNotFoundException;
import newspringproject.models.hotelmodels;
import newspringproject.repo.Hotelrepo;

@Service
public class Hotelservice implements HotelINF {

	@Autowired
	Hotelrepo repo;

	// Data Save
	@Override
	public String Savehotel(hotelmodels hotel) {

		try {
			repo.save(hotel);
			return "Hotel save Successfully for id :" + hotel.getHotelid();
		} catch (Exception e) {
			System.out.println(e);
			return "Something went wrong";
		}

	}

	// fetch Data

	@Override
	public List<hotelmodels> fetchhotel(int PageNumber, int PageSize) {

		try {
			Pageable pageable = PageRequest.of(PageNumber, PageSize, Sort.by("name").ascending());
			Page<hotelmodels> page = repo.findAll(pageable);
			List<hotelmodels> hotel = page.getContent();
			return hotel;

			// return repo.findAll();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	// Custom method (FindByName)

	@Override
	public List<hotelmodels> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<hotelmodels> getAlldatas() {
		List<hotelmodels> ht = repo.findAll();
		return ht;
	}

	// Delete Data
	@Override
	public List<hotelmodels> deletehotel(int id) {

		Optional<hotelmodels> hotels = repo.findById(id);
		if (hotels.isPresent()) {
			repo.deleteById(id);
			return repo.findAll();
		} else {
			throw new UserNotFoundException("Hotel Not Found");
		}

	}

	// Update data
	@Override
	public hotelmodels updatehotel(hotelmodels hotel) {

		try {
			hotel.setCheckinTime(hotel.getCheckinTime());
			repo.save(hotel);
			return repo.findById(hotel.getHotelid()).get();

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
