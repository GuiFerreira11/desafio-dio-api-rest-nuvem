package desafio.dio.nuvem.apiRest.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import desafio.dio.nuvem.apiRest.domain.model.User;
import desafio.dio.nuvem.apiRest.domain.repository.UserRepository;

@Service
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Override
	public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
    if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
      throw new IllegalArgumentException("This User ID already exists.");
    }
    return userRepository.save(userToCreate);
	}
  
}
