public class DataTypes {
    public static void main(String[] args) {
        //Let's see all the data types here!

//..................... Boolean Example Starts...............
        boolean man=true;
        boolean woman=false;

        if(man)
        System.out.println("Yes");
        else if(woman)
        System.out.println("No");
        else
        System.out.println("Helloluiah");

        man = false;
        woman = true;

        if(man)
        System.out.println("Yes");
        else if(woman)
        System.out.println("No");
        else
        System.out.println("Helloluiah");

        man = false;
        woman = false;

        if(man)
        System.out.println("Yes");
        else if(woman)
        System.out.println("No");
        else
        System.out.println("Helloluiah");
//..................... Boolean Example Starts...............

        int mufti_Tshirt1Price =  6000;
        long mTP = mufti_Tshirt1Price;  //Here implicit type casting is happening

        System.out.println("This price is of int : "+ mufti_Tshirt1Price);
        System.out.println("long price: " + mTP);

        long quta = 44444444445999l; //We have to add lorL after number otherwise it will take it as int not long 
        // int Quta = quta; this is wrong
        int Quta = (int)quta; //Here, when we inserting long into int we have to type cast it like this (int) , otherwise error will come

        System.out.println("Long number : " + quta);
        System.out.println("int number : " + Quta);

    }
}
