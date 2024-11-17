package com.sergiopinilla.BackEndPT.clients.controllers;

import com.sergiopinilla.BackEndPT.clients.dtos.ClientRequestDTO;
import com.sergiopinilla.BackEndPT.clients.dtos.ClientResponseDTO;
import com.sergiopinilla.BackEndPT.clients.services.ClientService;
import com.sergiopinilla.BackEndPT.shared.response.ApiResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/search")
    public ResponseEntity<ApiResponse> getClient(@Valid @ModelAttribute ClientRequestDTO clientReq) {
        return clientService.getClientByDocumentoAndTypeDocument(clientReq);
    }
}
