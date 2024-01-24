package org.example;

class Tea implements Ingredient
{
    private static double tea_Qty = 100;
    private static String ingredient_name="Tea";

    public void reduce_Qty(double qty) {
        tea_Qty = tea_Qty - qty;
    }
    public String get_Ingredient_name()
    {
        return ingredient_name;
    }

    public double get_Qty() {
        return tea_Qty;
    }
}
