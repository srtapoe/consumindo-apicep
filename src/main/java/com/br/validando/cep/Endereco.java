package com.br.validando.cep;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
    String logadouro;
    String bairro;
    String localidade;

    @Override
    public String toString() {
        return "Endereco{" +
                "logadouro='" + logadouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
