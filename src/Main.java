import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ky tu can dem: ");
        char ch = sc.nextLine().charAt(0);
        sc.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu "+ ch+"trong chuoi "+str + "la: "+count);
    }
}