package Tugas;

import java.util.ArrayList;

public abstract class Calculator {

    //attribute
    private final ArrayList<Integer> number = new ArrayList<>();
    private double total;
    private String tampil;

    //getter and setter
    public int getNumber(int index) { return this.number.get(index); }
    public void setNumber(int number) { this.number.add(number); }
    public float getTotal() { return (float) total; }
    public void setTotal(double total) { this.total = total; }
    public String getTampil() {return tampil;}
    public void setTampil(String tampil) {this.tampil = tampil;}

    //method
    public void clearNumber(){
        this.number.clear();
    }
    public int sizeNumber(){
        return this.number.size();
    }

    abstract void tampil(String operation);

    abstract void add();
    abstract void substract();
    abstract void multiply();
    abstract void divide();

    abstract void squareRoot();
    abstract void exponentiation();
    abstract void factorial();
}


