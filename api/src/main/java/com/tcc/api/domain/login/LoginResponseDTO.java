package com.tcc.api.domain.login;

import java.util.UUID;

public record LoginResponseDTO(UUID id, String usuario, String senha) {

}
