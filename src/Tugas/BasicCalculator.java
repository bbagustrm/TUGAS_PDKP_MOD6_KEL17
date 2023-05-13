package Tugas;

public class BasicCalculator extends Calculator {

    void add(){
        int result = getNumber(0);
        for (int i = 1; i < sizeNumber(); i++) {
            result += getNumber(i);
        }
        setTotal(result);
    }

    void substract(){
        int result = getNumber(0);
        for (int i = 1; i < sizeNumber(); i++) {
            result -= getNumber(i);
        }
        setTotal(result);
    }

    void multiply() {
        int result = getNumber(0);
        for (int i = 1; i < sizeNumber(); i++) {
            result *= getNumber(i);
        }
        setTotal(result);
    }

    void divide() {
        double result = getNumber(0);
        for (int i = 1; i < sizeNumber(); i++) {
            result /= getNumber(i);
        }
        setTotal(result);
    }

    @Override
    boolean tampil(String operation){
        String tampil = "";
        for (int i = 0; i < sizeNumber(); i++){
            if (i + 1 == sizeNumber()){
                tampil += ( Integer.toString(getNumber(i)));
            }else {
                tampil += ( Integer.toString(getNumber(i)) + " " + operation + " ");
            }

        }
        setTampil(tampil);
        return false;
    }

    @Override
    void squareRoot() {}

    @Override
    void exponentiation() {}

    @Override
    void factorial(){}

}
