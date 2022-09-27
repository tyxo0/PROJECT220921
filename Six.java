import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] unit ={50000, 10000, 1000, 500, 100, 50, 10, 1};
        int inp =0;
        System.out.print("금액을 입력하시오>>");
        inp = scanner.nextInt();
        for(int i=0; i<unit.length; i++){
            if(inp/unit[i] != 0)
                System.out.println(unit[i] + "원 짜리 :" + inp/unit[i] +"개");
            inp %=unit[i];
        }
        scanner.close();
    }
}
