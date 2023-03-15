package com.app.designpattern.strategy;



public class 策略模式 {
    public static void main(String[] args) {
        Calc20 calc20 = new Calc20();
        CalcT calcT = new CalcT(calc20);
        int calc = calcT.calc(10);

        System.out.println(calc);
    }
}


interface Calc{
    public int calc(int i);
}
class Calc10 implements Calc{

    @Override
    public int calc(int i) {
        return i+10;
    }
}

class Calc20 implements Calc{

    @Override
    public int calc(int i) {
        return i+20;
    }
}

class Calc30 implements Calc{

    @Override
    public int calc(int i) {
        return i+30;
    }
}

class CalcT{
    private  Calc calc;
    public CalcT(Calc calc){
        this.calc=calc;
    }

    public Calc getCalc() {
        return calc;
    }

    public void setCalc(Calc calc) {
        this.calc = calc;
    }
    public int calc(int i){ return calc.calc(i);}

}
