package PaqComplex;

public class ComplexNumber {
    double real;
    double img;

    public ComplexNumber() {
        this.real=0;
        this.img=0;
    }

    public ComplexNumber(int real, int img){
        this.real = real;
        this.img = img;
    }

    public ComplexNumber(double real, double img){
        this.real = real;
        this.img = img;
    }

    public ComplexNumber(ComplexNumber complex){
        this.real = complex.real;
        this.img = complex.img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public ComplexNumber add(ComplexNumber x){

        double real = 0;
        double img = 0;

        real = this.real + x.real;
        img = this.img + x.img;

        return new ComplexNumber(real, img);
    }

    public ComplexNumber sub(ComplexNumber x){

        double real = 0;
        double img = 0;

        real = this.real - x.real;
        img = this.img - x.img;

        return new ComplexNumber(real, img);
    }

    public ComplexNumber mult(ComplexNumber x){

        //(a + bi) · (c + di) = (ac − bd) + (ad + bc)i
        double real = 0;
        double img = 0;

        real = (this.real * x.real) - (this.img * x.img);
        img = (this.real * x.img) + (this.img * x.real);

        return new ComplexNumber(real, img);
    }

    public ComplexNumber multScalar(double x){

        double real = 0;
        double img = 0;

        real = (this.real * x);
        img = (this.img * x);

        return new ComplexNumber(real, img);
    }

    public boolean compare (ComplexNumber x){
        if (this.real == x.real){
            if (this.img == x.img){
                return true;
            }
            else return false;
        }
        else return false;
    }

    public String toString(){
        return this.real + " + " + this.img + "i";
    }
}
