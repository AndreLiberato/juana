package br.com.api.juana.controllers;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.juana.enums.EstadoCivil;
import br.com.api.juana.enums.FormacaoAcademica;
import br.com.api.juana.enums.Genero;
import br.com.api.juana.enums.TipoArquivo;
import br.com.api.juana.enums.UnidadeFederativa;
import br.com.api.juana.util.EnumUtil;

@RestController
@RequestMapping("/static")
public class EnumController {

    @Autowired
    private EnumUtil enumUtil;

    @GetMapping("/estado_civil")
    public ResponseEntity<?> estadoCivil() {
        Map<String, String> estadosCivis = enumUtil.toChaveValor(EstadoCivil.values());

        return ResponseEntity.status(HttpStatus.OK).body(estadosCivis);
    }

    @GetMapping("/formacao_academica")
    public ResponseEntity<?> formacaoAcademica() {
        Map<String, String> formacoesAcademicas = enumUtil.toChaveValor(FormacaoAcademica.values());

        return ResponseEntity.status(HttpStatus.OK).body(formacoesAcademicas);
    }

    @GetMapping("/genero")
    public ResponseEntity<?> genero() {
        Map<String, String> generos = enumUtil.toChaveValor(Genero.values());

        return ResponseEntity.status(HttpStatus.OK).body(generos);
    }

    @GetMapping("/tipo_arquivo")
    public ResponseEntity<?> tipoArquivo() {
        Map<String, String> tipoArquivos = enumUtil.toChaveValor(TipoArquivo.values());

        return ResponseEntity.status(HttpStatus.OK).body(tipoArquivos);
    }

    @GetMapping("/unidade_federativa")
    public ResponseEntity<?> unidadeFederativa() {
        Map<String, String> unidadesFederativas = enumUtil.toChaveValor(UnidadeFederativa.values());

        return ResponseEntity.status(HttpStatus.OK).body(unidadesFederativas);
    }

    @GetMapping("/unidade_federativa/sigla")
    public ResponseEntity<?> unidadeFederativaSigla() {
        Map<String, String> unidadesFederativas = enumUtil.toChaveValor(UnidadeFederativa.values(), UnidadeFederativa::getSigla);

        return ResponseEntity.status(HttpStatus.OK).body(unidadesFederativas);
    }
}