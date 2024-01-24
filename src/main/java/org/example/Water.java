package org.example;

class Water implements Ingredient {
    private static double water_Qty = 100;
    private static String ingredient_name="Water";

    public void reduce_Qty(double qty) {
        water_Qty = water_Qty - qty;
    }
    public String get_Ingredient_name()
    {
        return ingredient_name;
    }

    public double get_Qty() {
        return water_Qty;
    }
}
