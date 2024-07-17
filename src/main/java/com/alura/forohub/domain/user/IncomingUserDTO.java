package com.alura.forohub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record IncomingUserDTO(@NotBlank String username, @NotBlank String password) {

}
