public class ArithematicOperations {
 
    public static void main(String[] args) {
        int a=9,b=3,c=4;
        float d=5;

        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println(a/d);
        System.out.println(a+d);
        System.out.println(a*d);
        System.out.println(a-d);

     
        if(a==b){  //We can't compare number directy in if bracket 
            System.out.println("a equals b");
        }
        else{
            System.out.println(" a not equals b");
        }

        boolean checkif  = false; 
        if(checkif){  //We can't put 0 or 1 in if bracket like in java if(0)is wrong considered also we can't write true or false in bracket
            System.out.println("if block running");
        }
        else{
            System.out.println("else block running");
        }
    }
}