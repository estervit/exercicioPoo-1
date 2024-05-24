package aplication;

import entities.Retangulo;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Retangulo retangulo = new Retangulo();

            System.out.println("Informe a alura do retângulo: ");
            retangulo.altura = sc.nextDouble();

            System.out.println("Informe a base do retângulo: ");
            retangulo.base = sc.nextDouble();

            System.out.println("Area: " + retangulo.area());
            System.out.println("Perimetro: " + retangulo.perimetro());
            System.out.println("Diagonal: " + retangulo.diagonal());


            sc.close();
        }
    }

