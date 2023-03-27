public class Programs {
    public static void main(String[] args) {
        // int n = 47389,d;
        // while(n>10){
        //     d=n%10;
        //     System.out.println(d);
        //     n=n/100;
        // }
        // System.out.println(n);

        System.out.println("Good".concat("Day"));
        System.out.println("MERRYWORLD".substring(0,5));
        System.out.println("My_dream".length());
        System.out.println("Memory".startsWith("Me"));

        int y =5;
        y += ++y + --y + y--; // (y += 5 + (6+5+5))
        // 5 + 6 + 5 + 5
        System.out.println(y);

        System.out.println(Math.sqrt(196) + Math.pow(49, 0.5));
        System.out.println(Math.floor(17.9)+Math.ceil(-17.5));
        System.out.println(Math.floor(17.5));
        System.out.println(Math.ceil(7.8));
        System.out.println(Math.ceil(-17.5));
    }
}
