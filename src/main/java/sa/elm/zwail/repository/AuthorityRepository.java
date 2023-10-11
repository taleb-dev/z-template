package sa.elm.zwail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.elm.zwail.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
