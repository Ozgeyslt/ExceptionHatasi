import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void atmMachine(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ATM'den cekmek istediginiz tutari girin");
        int tutar= scanner.nextInt();
        if (tutar>20000){
            throw new AtmMachineException("Hatali para cekimi");
        }else {
            System.out.println("ATM : " + tutar + " odeniyor");
        }
    }

    public static void main(String[] args) {

        try {
            atmMachine();
        }catch (AtmMachineException e){
            e.printStackTrace();
        }
    }
}