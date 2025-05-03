package desafio.dio.nuvem.apiRest.service;

import desafio.dio.nuvem.apiRest.domain.model.User;

public interface IUserService {

  User findById(Long id);

  User create(User userToCreate);

}
