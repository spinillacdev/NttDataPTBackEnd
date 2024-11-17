package com.sergiopinilla.BackEndPT.clients.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequestDTO {
    @NotNull(message = "El tipo de documento no puede ser nulo")
    @Pattern(regexp = "^[CP]$", message = "El tipo de documento debe ser 'C' o 'P'")
    private String typeDocument;
    @NotNull(message = "El número de documento no puede ser nulo")
    @Pattern(regexp = "^[0-9]{8,12}$", message = "El número de documento debe ser numérico y tener entre 8 y 12 dígitos")
    private String numberDocument;
}
