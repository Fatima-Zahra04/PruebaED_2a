/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 *Clase que representa un NIF 
 *Calcula automáticamente la letra a partir del número
 *
 * @author ProfeDiurno
 * @version 1.0
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }
    
    
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }
    
    /**
     * Constructor por defecto. Inicializa el NIF vacío.
     */
    
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    /**
     * Devuelve el NIF en formato "numero-letra".
     * 
     * @return representación en texto del NIF
     */

    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    
    /**
     * Modifica el número del NIF y recalcula la letra.
     * 
     * @param numero nuevo número del NIF
     */

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    
    /**
     * Compara dos objetos Nif por su número y letra.
     * 
     * @param obj objeto a comparar
     * @return true si son iguales, false si no
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
