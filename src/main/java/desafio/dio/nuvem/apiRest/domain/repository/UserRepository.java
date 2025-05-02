package desafio.dio.nuvem.apiRest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafio.dio.nuvem.apiRest.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{}
