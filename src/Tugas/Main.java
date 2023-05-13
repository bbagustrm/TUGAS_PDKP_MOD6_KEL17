package Tugas;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator basicCalculator = new BasicCalculator();
        Calculator scientificCalculator = new ScientificCalculator();

        String pilihCalculator, optionPerhitungan, inputNumber;

        while(true){
            questionDisplay1();
            pilihCalculator = input.next();
            System.out.print("\n");

            if (Objects.equals(pilihCalculator, "x")){
                System.out.println("\nThank you for using app");
                break;
            }else{
                if(Objects.equals(pilihCalculator, "1")){
                    while(true){
                        questionDisplay2();
                        optionPerhitungan = input.next();
                        if (Objects.equals(optionPerhitungan, "x")){
                            System.out.print("\n");
                            break;
                        } else if (Objects.equals(optionPerhitungan, "1")) {
                            while(true){
                                System.out.print("Input number (x for finish) : ");
                                inputNumber = input.next();
                                if (Objects.equals(inputNumber, "x")){
                                    basicCalculator.add();
                                    basicCalculator.tampil("+");
                                    System.out.println(basicCalculator.getTampil());
                                    System.out.println("Result = " + Math.round(basicCalculator.getTotal()) + "\n");
                                    basicCalculator.clearNumber();
                                    break;
                                }else{
                                    basicCalculator.setNumber(Integer.parseInt(inputNumber));
                                }
                            }
                        } else if (Objects.equals(optionPerhitungan, "2")) {
                            while(true){
                                System.out.print("Input number (x for finish) : ");
                                inputNumber = input.next();
                                if (Objects.equals(inputNumber, "x")){
                                    basicCalculator.substract();
                                    basicCalculator.tampil("-");
                                    System.out.println(basicCalculator.getTampil());
                                    System.out.println("Result = " + Math.round(basicCalculator.getTotal()) + "\n");
                                    basicCalculator.clearNumber();
                                    break;
                                }else{
                                    basicCalculator.setNumber(Integer.parseInt(inputNumber));
                                }
                            }
                        } else if (Objects.equals(optionPerhitungan, "3")) {
                            while(true){
                                System.out.print("Input number (x for finish) : ");
                                inputNumber = input.next();
                                if (Objects.equals(inputNumber, "x")){
                                    basicCalculator.multiply();
                                    basicCalculator.tampil("*");
                                    System.out.println(basicCalculator.getTampil());
                                    System.out.println("Result = " + Math.round(basicCalculator.getTotal()) + "\n");
                                    basicCalculator.clearNumber();
                                    break;
                                }else{
                                    basicCalculator.setNumber(Integer.parseInt(inputNumber));
                                }
                            }
                        } else if (Objects.equals(optionPerhitungan, "4")) {
                            while(true){
                                System.out.print("Input number : ");
                                inputNumber = input.next();
                                if (Objects.equals(inputNumber, "x")){
                                    basicCalculator.divide();
                                    basicCalculator.tampil("/");
                                    System.out.println(basicCalculator.getTampil());
                                    System.out.println("Result = " + basicCalculator.getTotal() + "\n");
                                    basicCalculator.clearNumber();
                                    break;
                                }else{
                                    basicCalculator.setNumber(Integer.parseInt(inputNumber));
                                }
                            }
                        }else{
                            System.out.println("\nChoose again (1-4)");
                        }
                    }
                }else if(Objects.equals(pilihCalculator, "2")){
                    while(true){
                        questionDisplay3();
                        optionPerhitungan = input.next();
                        if (Objects.equals(optionPerhitungan, "x")){
                            System.out.print("\n");
                            break;
                        } else if (Objects.equals(optionPerhitungan, "1")) {
                            System.out.print("Input number : ");
                            inputNumber = input.next();
                            scientificCalculator.setNumber(Integer.parseInt(inputNumber));
                            scientificCalculator.squareRoot();
                            scientificCalculator.setTampil( "√" + scientificCalculator.getNumber(0));
                            System.out.println(scientificCalculator.getTampil());
                            System.out.println("Result = " + Math.round(scientificCalculator.getTotal()) + "\n");
                            scientificCalculator.clearNumber();

                        } else if (Objects.equals(optionPerhitungan, "2")) {
                            for(int i = 0; i < 2; i++){
                                System.out.print("Input number : ");
                                inputNumber = input.next();
                                scientificCalculator.setNumber(Integer.parseInt(inputNumber));
                            }
                            scientificCalculator.exponentiation();
                            scientificCalculator.tampil("^");
                            System.out.println(scientificCalculator.getTampil());
                            System.out.println("Result = " + Math.round(scientificCalculator.getTotal()) + "\n");
                            scientificCalculator.clearNumber();

                        } else if (Objects.equals(optionPerhitungan, "3")) {
                            System.out.print("Input number : ");
                            inputNumber = input.next();
                            scientificCalculator.setNumber(Integer.parseInt(inputNumber));
                            scientificCalculator.factorial();
                            scientificCalculator.setTampil(scientificCalculator.getNumber(0) + "!");
                            System.out.println(scientificCalculator.getTampil());
                            System.out.println("Result = " + Math.round(scientificCalculator.getTotal()) + "\n");
                            scientificCalculator.clearNumber();

                        }else{
                            System.out.println("\nChoose again (1-3)");
                        }
                    }
                }else{
                    System.out.println("\nCant understand the request");
                }
            }
        }


    }

    public static void questionDisplay1(){
        System.out.println("*** CALCULATOR ***");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.print("Choose Calculator (x for exit) : ");
    }

    public static void questionDisplay2(){
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subscription");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose Arithmatic Operation (x for cancel) : ");
    }

    public static void questionDisplay3(){
        System.out.println("Scientific Calculator");
        System.out.println("1. Square Root");
        System.out.println("2. Eksponentiation");
        System.out.println("3. Factorial");
        System.out.print("Choose Scirntific Operation (x for cancel) : ");
    }

}