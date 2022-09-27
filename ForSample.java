public class ForSample { 
    public static void main(String[] args) { 
        int sum=0;
        for(int i=1; i<=10; i++) { // 1~10까지 반복 
            sum += i; 
            System.out.print(i); // 더하는 수 출력
            if(i<=9) // + 출력 
                System.out.print("+");
            else { // i가 10
                System.out.print("="); // = 출력
                System.out.print(sum); 
            }
        } 
    }
}