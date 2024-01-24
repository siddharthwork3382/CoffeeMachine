package org.example;

class Milk implements Ingredient {
    private static double milk_Qty = 100;
    private static String ingredient_name="Milk";
    public String get_Ingredient_name()
    {
        return ingredient_name;
    }

    public void reduce_Qty(double qty) {
        milk_Qty = milk_Qty - qty;
    }

    public double get_Qty() {
        return milk_Qty;
    }
}
