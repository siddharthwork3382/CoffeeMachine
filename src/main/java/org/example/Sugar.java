package org.example;

class Sugar implements Ingredient
{
    private static double sugar_Qty = 100;
    private static String ingredient_name="Sugar";

    public void reduce_Qty(double qty) {
        sugar_Qty  = sugar_Qty  - qty;
    }
    public String get_Ingredient_name()
    {
        return ingredient_name;
    }
    public double get_Qty() {
        return sugar_Qty ;
    }
}