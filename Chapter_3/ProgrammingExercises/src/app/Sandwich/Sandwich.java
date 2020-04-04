package app.Sandwich;

public class Sandwich{

    private String mainIngredient;
    private String breadType;
    double price;

    public Sandwich()
    {
        mainIngredient = "tuna";
        breadType = "wheat";
        price = 0;
    }

    public void setMainIngredient(String ingredient){
        mainIngredient = ingredient;
    }

    public void setBreadType(String bread){
        breadType = bread;
    }

    public void setPrice(double priceFood) {
        price = priceFood;
    }

    public String getMainIngredient(){
        return mainIngredient;
    }

    public String getBreadType(){
        return breadType;
    }

    public double getPrice(){
        return price;
    }

}