package com.sergiopinilla.BackEndPT.clients.mapper;

import com.sergiopinilla.BackEndPT.clients.dtos.ClientResponseDTO;
import com.sergiopinilla.BackEndPT.clients.models.ClientModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")  // Anotación para generar un bean de Spring
public interface ClientMapper {

    // Mapea los campos del ClientModel a ClientResponseDTO
    @Mapping(source = "firstName", target = "primerNombre")
    @Mapping(source = "middleName", target = "segundoNombre")
    @Mapping(source = "lastName", target = "primerApellido")
    @Mapping(source = "secondLastName", target = "segundoApellido")
    @Mapping(source = "phone", target = "telefono")
    @Mapping(source = "address", target = "direccion")
    @Mapping(source = "cityOfResidence", target = "ciudadResidencia")
    ClientResponseDTO clientToClientResponseDTO(ClientModel client);
}