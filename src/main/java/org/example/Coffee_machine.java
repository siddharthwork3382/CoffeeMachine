package org.example;











public class Coffee_machine {

    Milk milk =new Milk();
    Water water=new Water();
    Coffee coffee =new Coffee();
    Tea tea= new Tea();
    Sugar sugar= new Sugar();




    public double warm(Ingredient ingredient, double ingredient_qty)
    {
        System.out.println(ingredient.get_Ingredient_name()+" is being warmed please wait");
        System.out.println(ingredient.get_Ingredient_name()+" has been warmed and is ready");
        return ingredient_qty;
    }


    public void give_tea()
    {
        if(sugar.get_Qty()<5 || tea.get_Qty()<5 || milk.get_Qty()<5 || water.get_Qty()<5)
            System.out.println("Please Refill the ingredients");
        else
        {
            double tea_made=  warm(water,5)+warm(milk,5)+5+5;
            water.reduce_Qty(5);
            milk.reduce_Qty(5);
            System.out.println("2 tbsp Sugar is added");
            sugar.reduce_Qty(5);
            System.out.println("1 tbsp tea is added");
            tea.reduce_Qty(5);
            System.out.println("Everything is warmed");
            System.out.println("Here is your tea");
        }
        return;
    }


    public void give_coffee()
    {
        if(sugar.get_Qty()<5 || milk.get_Qty()<5 || water.get_Qty()<5){
            System.out.println("Ingredient is in low qty ,please Refill all the ingredients");
            return;
        }


          System.out.println("Making the coffee please wait 5 minutes");
            //double coffee_made=  warm(water,5)+warm(milk,5);
            water.reduce_Qty(5);
            milk.reduce_Qty(5);
            System.out.println("2 tbsp Sugar is added");
            sugar.reduce_Qty(5);
            System.out.println("1 tbsp coffee is added");
            coffee.reduce_Qty(5);
            System.out.println("Everything is warmed");
            System.out.println("Here is your coffee");
        return;
    }
    public void give_warmWater()
    {
        if(water.get_Qty()<=5) {
            System.out.println("Water cart is low please refill!!");
            return;
        }

            warm(water,5);
            water.reduce_Qty(5);
            return;

    }
    public void give_warmMilk()
    {
        if(milk.get_Qty()<=5) {
            System.out.println("Milk cart is low please refill!!");
            return;
        }
            warm(milk,5);
            milk.reduce_Qty(5);
            return;
    }



}
