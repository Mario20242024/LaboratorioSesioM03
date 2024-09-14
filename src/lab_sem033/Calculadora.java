/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_sem033;

/**
 *
 * @author casa
 */
public class Calculadora {
    private double num1;
    private double num2;
    private Operacion operacion;
    

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double calcular() {
        if(operacion == null){
            return 0;
        }
        switch (operacion) {
            case Suma:
                return num1 + num2;
            case Resta:
                return num1 - num2;
            case Multiplica:
                return num1 * num2;
            case Divide:
                return num1 / num2;
            default:
                return 0;
        }
    }

    public void reset() {
        this.num1 = 0;
        this.num2 = 0;
        this.operacion = null;
    }
    
    public enum Operacion{
        Suma,
        Resta,
        Multiplica,
        Divide
    }
}

