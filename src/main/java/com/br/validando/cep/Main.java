package com.br.validando.cep;

import com.br.validando.cep.ServicoDeCep.ServicoDeCep;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe seu cep: ");
        Scanner cepEntrada = new Scanner(System.in);
        String cep = cepEntrada.nextLine();
        Endereco endereco = ServicoDeCep.buscarEnderecoPelo(cep);


        System.out.println("Logradouro: " + endereco.getLogadouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
    }
}
