package MobileApps.MobileApps.Resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import MobileApps.MobileApps.Services.MobileInterface;
import MobileApps.MobileApps.model.Mobile;

@RestController
public class MobileController {
	@Autowired
	private MobileInterface mobileService;

	@GetMapping("/all")
	public List<Mobile> getAll() {
		return mobileService.findAll();
	}

	@GetMapping("/all/{id}")
	public Optional<Mobile> getByid(@RequestBody Mobile mobile, @PathVariable int id) {
		return mobileService.getById(id);
	}

	@PostMapping("/add")
	public String saveMobile(@RequestBody Mobile mobile) {
		mobileService.addMobile(mobile);
		return "Mobile has been added with id" + mobile.getId();
	}

	@PutMapping("/update/{id}")
	public String updateMobile(@RequestBody Mobile mobile, @PathVariable int id) {
		mobileService.updateMobile(mobile);
		return "Mobile details has been updated with id" + mobile.getId();
	}

	// delete by id

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int uid) {
		mobileService.deleteMobile(uid);

	}

}
