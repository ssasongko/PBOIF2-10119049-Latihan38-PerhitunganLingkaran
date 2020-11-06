package Lingkaran;
import java.util.Scanner;
/**
 *
 * @author Nur Sasongko
 */
public class Lingkaran {
    Scanner scan = new Scanner(System.in);
    
    public double diameter;
    
    public void setDiameter (){
        //init vars
        boolean isDouble;
        String tempValue;
        
        System.out.println("=======Perhitungan Lingkaran=======");
        
        do{
            System.out.print("Masukkan nilai diameter lingkaran : ");        
            tempValue = scan.nextLine();
            
            if(tempValue.matches("[0-9]*")) {
                diameter = Double.parseDouble(tempValue);
                isDouble = true;
            }
            else{
                System.out.println("Nilai Diameter tidak sesuai");
                isDouble = false;
            }
           }
        while(!isDouble);
        
//        System.out.println(diameter);
    }    
    
    public double getJariJari(){
        return diameter/2;
    }
    
    public double getLuas(){
        return Math.PI * diameter/2 * diameter/2;
    }
    
    public double getKeliling(){
        return 2 * Math.PI * (diameter/2);
    }
    
    public void getTampilData(){
        System.out.printf("\n=====Hasil Perhitungan Lingkaran=====\n");
        System.out.printf("Jari - Jari Lingkaran = %.0f cm\n", getJariJari());
        System.out.printf("Luas Lingkaran = %.2f cm\n",getLuas());
        System.out.printf("Keliling Lingkaran = %.2f cm\n", getKeliling());
    }
    
}
