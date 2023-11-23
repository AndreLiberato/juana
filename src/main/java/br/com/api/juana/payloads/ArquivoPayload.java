package br.com.api.juana.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ArquivoPayload {
    @NotBlank(message = "Nome do arquivo não pode ser branco")
    private String originalName;

    @NotBlank(message = "O tipo precisa ser PDF")
    private String mimeType;

    @NotNull(message = "O arquivo não pode estar vazio")
    private int size;

    @NotNull(message = "{bytes.not.null}")
	protected byte[] bytes;
}
