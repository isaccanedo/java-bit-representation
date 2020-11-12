package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class BitRepresentation {

    // Exibe a representação de Bits do valor inteiro especificado
    public static void display(int value) {
        System.out.printf("\nBit representation of %d is: \n", value);

        // Cria um valor inteiro com 1 no bit mais à esquerda e os outros locais
        int displayMask = 1 << 31;

        // Para cada bit exibe 0 ou 1
        for (int bit = 1; bit <= 32; bit++) {

            // Utiliza displayMask para isolar o bit
            System.out.print((value & displayMask) == 0 ? '0' : '1');
            value <<= 1; // desloca o valor uma posição para a esquerda

            if (bit % 8 == 0)
                System.out.print(' '); // Exibe espaço a da 8 bits

        }

    }

    public static void main(String[] args) {

        display(33);

    }
}