package MobileApps.MobileApps.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MobileApps.MobileApps.Repositories.MobileRepository;
import MobileApps.MobileApps.model.Mobile;

@Service
public class MobileServices implements MobileInterface {

	@Autowired
	private MobileRepository repository;

	@Override
	public Mobile addMobile(Mobile mobile) {
		return repository.save(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile updateMobile) {
		return repository.save(updateMobile);
	}

	@Override
	public List<Mobile> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Mobile> getById(int id) {
		return repository.findById(id);

	}

	@Override
	public void deleteMobile(int uid) {
		repository.deleteById(uid);

	}

}
