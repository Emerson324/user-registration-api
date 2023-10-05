package emerson.service;

import emerson.converter.DTOConverter;
import emerson.dto.UserDTO;
import emerson.exception.ResourceNotFoundException;
import emerson.model.User;
import emerson.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        return users
                .stream()
                .map(DTOConverter::convert)
                .collect(Collectors.toList());
   }

   public UserDTO findById(long userId){
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Nenhum usuário encontrado com este id"));
        return DTOConverter.convert(user);
   }

   public UserDTO save(UserDTO userDTO) {
       userDTO.setDataCadastro(LocalDateTime.now());
       User user = userRepository.save(User.convert(userDTO));
       return DTOConverter.convert(user);
   }
}
