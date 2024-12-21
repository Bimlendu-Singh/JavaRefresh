
// Solution class which contains main method

public class javaQn1TravelAgencies
{
    public static void main(String[] args) {
       
        TravelAgencies[] tAgencies = {
            new TravelAgencies(1, "A2ZAgency", "Platinum", 50000, true),
            new TravelAgencies(2, "SecondAgency", "Platinum", 60000, false),
            new TravelAgencies(3, "ThirdAgency", "Platinum", 20000, true),
            new TravelAgencies(4, "FourthAgency", "Platinum", 80000, false)
        };

        int highestPackagePrice = findAgencyWithHighestPackagePrice(tAgencies);
        System.out.println(highestPackagePrice);
    }

    // Method to find highest package 
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] obj)
    {
        int x=0;

        for(TravelAgencies iterateA:obj)
        {
            if(x<iterateA.price)
                x=iterateA.price;
        }

        return x;

    }
}

