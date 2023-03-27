package Programs;
public class MethOverEx {
    // a statement
    public static void num_calc(int num, char ch) {
        if(ch=='s'){
            System.out.println(num*num);
        }else if(ch=='S'){
            System.out.println(num*num*num);
        }   
    }
    // b statement
    public static void num_calc(int a, int b, char ch) {
        if(ch=='p'){
            System.out.println(a*b);
        } else if(ch=='P'){
            System.out.println(a+b);
        }
    }
    // c statement
    public static void num_calc(String s1, String s2) {
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
    public static void main(String[] args) {
        num_calc(2,'s');
        num_calc(3,7,'P');
        num_calc("Charlie", "Charlie");
    }
}