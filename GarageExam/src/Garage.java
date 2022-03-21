public class Garage {


    public double Hours;


    public Garage(Double Hours) throws GarageExceptionHandler {

        Cost = 2 + Hours;

        if ((Hours<=0) || (Cost>10))
            throw new GarageExceptionHandler("Values outside of range");
    }

    public String getDescription() {

        String description;

        if (Hours <= 3.0)
            description = "Cost is 2.00";
        else if (Hours >=4.0 && Hours <=4.9)
            description = "Cost is 2.50";
        else if (Hours >= 5.0 && Hours <= 5.9)
            description = "Cost is 3.00";
        else if (Hours >= 6.0 && Hours <= 6.9)
            description = "Cost is 3.50";
        else if (Hours >= 7.0 && Hours <= 7.9)
            description = "Cost is 4.00";
        else if (Hours >= 8.0 && Hours <= 8.9)
            description = "Cost is 4.50";
        else if (Hours >= 9.0 && Hours <= 9.9)
            description = "Cost is 5.00";
        else if (Hours >= 10.0 && Hours <= 10.9)
            description = "Cost is 5.50";
        else if (Hours >= 11.0 && Hours <= 11.9)
            description = "Cost is 6.00";
        else if (Hours >= 12.0 && Hours <= 12.9)
            description = "Cost is 6.50";
        else if (Hours >= 13.0 && Hours <= 13.9)
            description = "Cost is 7.00";
        else if (Hours >= 14.0 && Hours <= 14.9)
            description = "Cost is 3.50";

        else
            description = "Negative numbers are not valid";

        return description;
    }
}