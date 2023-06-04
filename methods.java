//methods
 
public class Main{
    public static void myname(){
       String name="Pardhu";
    }
    public static void main(String[]args){
        System.out.println(nmae);
    }
}
//methods with parameters
public class Main{
    public static void mymethod( String name){
        System.out.println(name +"Molli");
        
 
    }
    public static void main(String[]args){
        mymethod("veerababu");
        mymethod("pardhu");
        mymethod("rama");
    }
}
//multiple parameters
public class Main{
    public static void mymethod(String name, int age){
        System.out.println(name + age);
    }
    public static void main(String[]args){
        mymethod("pardhu", 21);
        mymethod("paaani",23);
    }
}
// return
public class Main{
    static int mymethod(int x, int y){
       return y+x;
       
   }
   public static void main(String[]args){
       System.out.println(mymethod(4, 7));
   }
}
//if in methods
public class Main{
    static void mymethod(int age){
        if (age<18){
            System.out.println("Access denied");
        }
        else{
            System.out.println("Access granted");
            
        }
    }
    public static void main{String[]args){
        mymethod(18);
        mymethod(31);
        mymethod(4);
    }
}