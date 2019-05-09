package MobileApps.MobileApps.Repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import MobileApps.MobileApps.model.Mobile;

public interface MobileRepository extends MongoRepository<Mobile, String> {

	Optional<Mobile> findById(int id);

	void deleteById(int uid);

}
