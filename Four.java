import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        c = scanner.next().charAt(0);
        do{
            for(char i ='a'; i< c + 1 ; i++)
                System.out.print(i);
            c--;
            System.out.println();
        }while(c !='a'-1);
        scanner.close();
    }
}
