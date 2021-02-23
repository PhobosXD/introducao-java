package br.com.atlasjr.interfaces;

/*
As classes que herdão as interfaces precisam sobrescrever os métodos que não estiverem definicos
como default.
Os métodos definidos como default são herdados automaticamente.
É possível implementar herança múltipla utilizando interfaces.
*/
/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Gol implements Carro {

    @Override
    public String marca() {
        return "Volkswagen";
    }
}
