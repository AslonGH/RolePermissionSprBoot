package uz.pdp.app_new_site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.app_new_site.entity.Lavozim;
import uz.pdp.app_new_site.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

@Repository
public interface LavozimRepository extends JpaRepository<Lavozim, Long> {

    Optional<Lavozim> findByName(String name);

    boolean existsByName(String name);

}
