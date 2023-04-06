import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[][]matrix = {{1.1f,2.2f,3.3f},{4.4f,5.5f,6.6f},{7.7f,8.8f,9.9f}};
        int column = 1;
        float sum = 0 ;
        for ( int i = 0; i < matrix.length; i++){
            sum += matrix[i][column];
        }
        System.out.println("tong cua cot " + column+ "la" + sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang cua mang ");
        int rows = sc.nextInt();
        System.out.println("nhap so cot cua mang ");
        int cols = sc.nextInt();
        float[][] userMatrix = new float[rows][cols];
        for (int i = 0; i<rows; i++){
          for (int j = 0; j<cols; j++) {
              System.out.println("nhap phan tu tai vi tri["+i+"]["+j+"]:");
              userMatrix[i][j] = sc.nextFloat();
          }
        }
        System.out.println("nhap so thu tu cua cot de tinh tong: ");
        int userColumn = sc.nextInt();
        float userSum = 0;
        for (int i=0; i<rows; i++){
            userSum += userMatrix[i][userColumn];
        }
        System.out.println("Tong cua cot: "+userColumn+"la "+userSum);
    }
}