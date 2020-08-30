package calculadora3;
public class Operaciones {  
    //atributos
    private float num1;
    private float num2;
    //constructor sin parametros
    public Operaciones(){
        this.num1 = 0;
        this.num2 = 0;  
    }
    //getters and setters
    public float getNum1(){
        return this.num1;
    }
    public void setNum1(float num1){
        this.num1 = num1;
    }
    public float getNum2(){
        return this.num2;
    }
    public void setNum2(float num2){
        this.num2 = num2;
    }
    //metodos de operaciones
    public float suma(){
        float suma;
        return suma = this.num1 + this.num2;
    }
    public float mult(){
        float mult;
        return mult = this.num1 * this.num2;
    }
    public float resta(){
        float resta;
        return resta = this.num1 - this.num2;
    }
    public float div(){
        float div;
        return div = this.num1 / this.num2;
    }
}