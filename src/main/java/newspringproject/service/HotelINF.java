package newspringproject.service;

import java.util.List;

import newspringproject.models.hotelmodels;

public interface HotelINF {

	String Savehotel(hotelmodels hotel);        // data save

	List<hotelmodels> fetchhotel(int PageNumber, int PageSize);             // data fetch

	List<hotelmodels> deletehotel(int id);      // delete data by his ID

	hotelmodels updatehotel(hotelmodels hotel);    // update data

	List<hotelmodels> findByName(String name);    // custom method findByName

	List<hotelmodels> getAlldatas();





}
