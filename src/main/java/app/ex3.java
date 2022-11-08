package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        List<Integer> binario0 = new ArrayList<>();
        List<Integer> binario1 = new ArrayList<>();
        List<Integer> NumBin = new ArrayList<>();
        List<String> decimal = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros binarios serao inseridos? ");
        int qtd = input.nextInt();

        int count1 = 0;
        int count0 = 0;
        for (int i=0; i<qtd; i++) {
            System.out.printf("Insira o numero binario %d: ", i);
            int bin = input.nextInt();
            if (bin == 0){
                count0++;
                binario0.add(bin);
                NumBin.add(bin);
            } else {
                count1++;
                binario1.add(bin);
                NumBin.add(bin);
            }
        }

        String x = String.valueOf(0);
        String y = String.valueOf(1);
        for (int i=0; i< NumBin.size(); i++) {
            if (count0 > count1){
                decimal.add(x);
            } else {
                decimal.add(y);
            }
        }

        int result = Integer.parseInt(String.valueOf(decimal), 2);

        input.close();
    }

}
