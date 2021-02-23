package br.com.atlasjr.classes.tipos.primitivos;

/**
 * @author Cazuza
 * @version 1.0
 * @since 2021-02-22
 */
public class Primitivos {
    /*
     * Tipos primitivos.
     * Não podem receber valor nulo!
     * Possuem valores default que podem ser encontrados na documentação da Oracle.
     */

    /*
     * Tipo byte:
     * Possui 8 bits distribuídos entre positivos e negativos.
     * Guarda apenas valores inteiros.
     */
    byte b1 = 127;
    byte b2 = -128;

    /*
     * Tipo char:
     * Possui 16 bits.
     * Guarda um único caracter alfanumérico.
     */
    char c1 = 'A';
    char c2 = 15;

    /*
     * Tipo short:
     * 16 bits.
     * Guarda valores inteiros positivos e negativos.
     */
    short s1 = 32767;
    short s2 = -32768;

    /*
     * Tipo int:
     * 32 bits.
     * Guarda valores inteiros positivos e negativos.
     */
    int i1 = 2147483647;
    int i2 = -2147483648;

    /*
     * Tipo long:
     * 63 bits.
     * Guarda valores inteiros positivos e negativos.
     * Necessita de um 'L' no final para informar ao compilador que este é um tipo long.
     */
    long lon = 9000L;

    /*
     * Tipo float:
     * 32 bits.
     * Guarda valores flutuantes.
     * Requer um 'F' ao final.
     */
    float f1 = 65.0F;
    float f2 = -0.5F;

    /*
     * Tipo double:
     * 64 bits.
     * Guarda valores flutuantes.
     */
    double dou;

    /*
     * Tipo boolean:
     * 1 bit.
     * Guarda verdadeiro ou falso.
     */

    boolean bool1 = true;
    boolean bool2 = false;
}
