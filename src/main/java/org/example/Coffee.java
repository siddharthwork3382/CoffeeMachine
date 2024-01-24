package org.example;

class Coffee implements Ingredient
{
    private static double coffee_Qty = 100;
    private static String ingredient_name="Coffee";

    public void reduce_Qty(double qty) {
        coffee_Qty  = coffee_Qty  - qty;
    }

    public String get_Ingredient_name()
    {
        return ingredient_name;
    }
    public double get_Qty() {
        return coffee_Qty ;
    }
}
