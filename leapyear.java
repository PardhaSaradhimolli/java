public class Main{
    public static void main(String[]args){
        int year=2023;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.Out.println(year+"is a leap year");
                }
            }
        }
        else
        System.Out.println(year+"is not a leap year");
    }
}