import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp =0;

        System.out.print("정수 몇 개>>");
        inp = scanner.nextInt();
        int []intArr = new int[inp];
        for(int i =0; i<intArr.length; i++){
            intArr[i] = (int)(Math.random()*99) +1 ;
            for(int check =0; check < i;  check++)
                if(intArr[check] == intArr[i])
                    i--;
        }
        for(int i =0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
            if((i+1)%10 ==0)
                System.out.println();
        }
        scanner.close();
    }
}
