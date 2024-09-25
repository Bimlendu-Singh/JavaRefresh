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

        int raniAge = 18;
        int bheemAge = 24;

        if(raniAge>18)
        System.out.println("rani is eligible for vote");
        else if(bheemAge>18)
        System.out.println("Bheem is elgible for vote");
        else
        System.out.println("No one is elgible for vote");

        int mineA=12, mineB = 19, mineC=4;

        if(mineA>mineB)
        {
            if (mineA>mineC) {
                System.out.println(mineA+" is greater");
            }
            else{
                System.out.println("mineC is greater: "+mineC);
            }
        }else if(mineB>mineC){
            if (mineB>mineA) {
                System.out.println(mineB+" is greater");
            }
            else{
                System.out.println("mineA is greater: "+mineA);
            }
        }else if(mineC>mineA){
            if (mineC>mineB) {
                System.out.println(mineC+" is greater");
            }
            else{
                System.out.println("mineB is greater: "+mineB);
            }
        }
        else{
            System.out.println("All are equal hero!");
        }

        // int minA=72, minB = 72, minC=42;
        // Below seems good but for above value it will show all are equal
        // if(minA>minB)
        // {
        //     if (minA>minC) {
        //         System.out.println(minA+" is greater");
        //     }
        //     else{
        //         System.out.println("minC is greater: "+minC);
        //     }
        // }else if(minB>minA){
        //     if (minB>minA) {
        //         System.out.println(minB+" is greater");
        //     }
        //     else{
        //         System.out.println("minA is greater: "+minA);
        //     }
        // }else{
        //     System.out.println("All are equal hero!");
        // }


    }
}