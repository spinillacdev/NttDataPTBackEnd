package com.sergiopinilla.BackEndPT.clients.services;

import com.sergiopinilla.BackEndPT.clients.dtos.ClientRequestDTO;
import com.sergiopinilla.BackEndPT.clients.dtos.ClientResponseDTO;
import com.sergiopinilla.BackEndPT.clients.mapper.ClientMapper;
import com.sergiopinilla.BackEndPT.clients.models.ClientModel;
import com.sergiopinilla.BackEndPT.shared.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientModel client = new ClientModel(
            "C",
            "23445322",
            "Sergio",
            "Nicolas",
            "Pinilla",
            "Cañon",
            "3227703426",
            "Calle 16 # 13 - 157",
            "Chiquinquira");

    @Autowired
    private ClientMapper clientMapper;

    public ResponseEntity<ApiResponse> getClientByDocumentoAndTypeDocument(ClientRequestDTO clientReq) {
        ApiResponse res = null;
        if (clientReq.getTypeDocument().equals(client.getDocumentType()) &&
                clientReq.getNumberDocument().equals(client.getDocumentNumber())) {
            ClientResponseDTO clientResponseDTO = clientMapper.clientToClientResponseDTO(client);
            res = new ApiResponse(HttpStatus.OK.value(),clientResponseDTO,"Cliente obtenido con exito");
            return new ResponseEntity<>(res, HttpStatus.OK);
        } else {
            res = new ApiResponse(HttpStatus.NOT_FOUND.value(),"Cliente no existe");
            return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
        }
    }
}
