import java.util.Scanner;
public class Fourteen {
    public static void main(String[] args) {
        String []course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int [] score ={95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        String inp;
        do{
            System.out.print("과목 이름>>");
            inp = scanner.nextLine();
            if(inp.equals("그만"))
                break;
            for(int i =0; i<course.length; i++){
                if(course[i].equals(inp)){
                    System.out.println(inp + "의 점수는 " + score[i]);
                    break;
                }
                else if(i == course.length -1)
                    System.out.println("없는 과목입니다.");
            }
        }while(!inp.equals("그만"));
        scanner.close();
    }
}
