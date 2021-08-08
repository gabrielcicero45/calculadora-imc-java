import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args){
        caculadoraIMC();
    }
    private static void caculadoraIMC(){
        System.out.print("Por favor insira seu peso em Kilogramas:");
        Scanner s = new Scanner(System.in);
        float peso = s.nextFloat();
        System.out.print("Por favor insira sua altura em Centimetros:");
        float altura = s.nextFloat();

        float imc = (100*100*peso)/(altura*altura);

        System.out.println("Seu IMC é :"+imc);
        imprimeCategoriaIMC(imc);
    }
    private static void imprimeCategoriaIMC(float imc){
        if(imc < 18.5){
            System.out.print("Você está abaixo do peso ideal");
        }else if (imc < 25){
            System.out.print("Você está no peso ideal");
        }else if(imc < 30){
            System.out.print("Você está acima do peso ideal");
        }else{
            System.out.print("Você está obeso");
        }
    }
}
