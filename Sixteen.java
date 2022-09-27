import java.util.Scanner;
public class Sixteen{
    public static void main(String[] args) {
        String [] rsp = {"가위", "바위", "보"};
        String inp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        int compu;
        do{
            System.out.print("가위 바위 보!>>");
            inp = scanner.nextLine();
            if(inp.equals("그만")) 
                break;
            compu = (int)(Math.random()*3);
            System.out.print("사용자 = " + inp + ", 컴퓨터 = " + rsp[compu] + ", ");
            
            if(inp.equals(rsp[compu]))
                System.out.println("비겼습니다.");
            else{
                if(inp.equals("가위")){
                    if(compu == 2)
                        System.out.println("사용자가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                }
                if(inp.equals("바위")){
                    if(compu == 0)
                        System.out.println("사용자가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                }
                if(inp.equals("보")){
                    if(compu == 1)
                        System.out.println("사용자가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                }    
            }

        }while(!inp.equals("그만"));
        System.out.println("게임을 종료합니다...");
        scanner.close();
    }
}