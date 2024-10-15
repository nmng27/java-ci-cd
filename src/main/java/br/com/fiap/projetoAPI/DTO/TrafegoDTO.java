package br.com.fiap.projetoAPI.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TrafegoDTO(
        Integer id,
        @NotBlank(message = "A data do trafego é obrigatorio!!!")
                @Size(min = 6, max = 8)
        String hora,
        @NotBlank(message = "O volume de trafego é obrigatorio!!!")
        Integer volume,
        @NotBlank(message = "A situação de congestionamento do trafego é obrigatorio!!!")
        Boolean situacao
) {
}
