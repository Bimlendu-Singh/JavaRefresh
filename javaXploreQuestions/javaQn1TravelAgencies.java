public class javaQn1TravelAgencies {

    // Declaring the class variables
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean FlightFacility;

    // Constructor with parameters
    public javaQn1TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean FlightFacility) {
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.FlightFacility=FlightFacility;
    }

    //Making setters for each variables
    public void setRegNo(int regNo)
    {
        this.regNo=regNo;
    }

    public void setAgencyName(String agencyName)
    {
        this.agencyName=agencyName;
    }

    public void setPackageType(String packageType)
    {
        this.packageType=packageType;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }

    public void setFlightFacility(boolean FlightFacility)
    {
        this.FlightFacility=FlightFacility;
    }

    //Making getters for each variables
    public int getRegNo()
    {
        return regNo;
    }

    public String getAgencyName()
    {
        return agencyName;
    }

    public String getPackageType()
    {
        return packageType;
    }

    public int getPrice()
    {
        return price;
    }

    public boolean getFlightFacility()
    {
        return FlightFacility;
    }

}