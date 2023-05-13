package Tugas;

public class ScientificCalculator extends Calculator{

    @Override
    void squareRoot(){
        double result = Math.sqrt(getNumber(0));
        setTotal(result);
    }

    @Override
    void exponentiation(){
        double result = Math.pow(getNumber(0), getNumber(1));
        setTotal(result);
    }

    @Override
    void factorial(){
        int result = 1;
        if (getNumber(0) == 0 || getNumber(0) == 1){
            result = result;
        }else{
            for (int i = 1; i <= getNumber(0); i++){
                result *= i;
            }
        }
        setTotal(result);
    }

    @Override
    void tampil(String operation){
        String tampil = "";
        for (int i = 0; i < sizeNumber(); i++){
            if (i + 1 == sizeNumber()){
                tampil += ( Integer.toString(getNumber(i)));
            }else {
                tampil += ( Integer.toString(getNumber(i)) + " " + operation + " ");
            }

        }
        setTampil(tampil);
    }

    @Override
    void add() {}

    @Override
    void substract() {}

    @Override
    void multiply() {}

    @Override
    void divide() {}
}
