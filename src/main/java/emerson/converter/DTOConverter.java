package emerson.converter;

import emerson.dto.UserDTO;
import emerson.model.User;

public class DTOConverter {

    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome(user.getNome());
        userDTO.setEmail(user.getEmail());
        userDTO.setSenha(user.getSenha());
        userDTO.setConfirmacaoSenha(user.getConfirmacaoSenha());
        userDTO.setDataCadastro(user.getDataCadastro());
        return userDTO;
    }
}
