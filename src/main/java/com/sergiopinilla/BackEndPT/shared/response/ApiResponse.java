package com.sergiopinilla.BackEndPT.shared.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private int code;
    private T data;
    private String message;

    public ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;  // No hay datos en errores
    }
}
