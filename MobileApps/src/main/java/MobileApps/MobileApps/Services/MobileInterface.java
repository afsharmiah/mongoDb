package MobileApps.MobileApps.Services;

import java.util.List;
import java.util.Optional;

import MobileApps.MobileApps.model.Mobile;

public interface MobileInterface {

	Mobile addMobile(Mobile addMobile);

	Mobile updateMobile(Mobile updateMobile);

	List<Mobile> findAll();

	Optional<Mobile> getById(int id);

	void deleteMobile(int uid);

}
