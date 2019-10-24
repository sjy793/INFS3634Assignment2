package com.example.infs3634assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {

    public static FoodConstructor getFoodById(int foodID) {
        return food.get(foodID);
    }

    public static ArrayList<FoodConstructor> getAllFood() {
        return new ArrayList<FoodConstructor>((List) Arrays.asList(food.values().toArray()));
    }

    private static final HashMap<Integer, FoodConstructor> food = new HashMap<>();

    static {
        food.put(1, new FoodConstructor(
                1,
                "Burger",
                "$ 6.49",
                "A flat round cake of minced beef that is fried or grilled and typically served in a bread roll.",
                R.drawable.burger
        ));
        food.put(2, new FoodConstructor(
                2,
                "Chips",
                "$ 2.99",
                "Thin slices of potato that have been deep fried or baked until crunchy.",
                R.drawable.chips
        ));

        food.put(3, new FoodConstructor(
                3,
                "Bacon and Egg",
                "$ 5.99",
                "A full breakfast. Eggs-and-bacon, also known as \"Bird's foot trefoil\", a variety of Lotus flower.",
                R.drawable.baconandegg
        ));

        food.put(4, new FoodConstructor(
                4,
                "Coffee",
                "$ 3.49",
                "A hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub.",
                R.drawable.coffee
        ));

        food.put(5, new FoodConstructor(
                5,
                "Cola",
                "$ 2.99",
                "A brown carbonated drink that is flavoured with an extract of cola nuts, or with a similar flavouring.",
                R.drawable.cola
        ));

        food.put(6, new FoodConstructor(
                6,
                "Croissant",
                "$ 2.49",
                "A French crescent-shaped roll made of sweet flaky yeast dough, eaten for breakfast.",
                R.drawable.croissant
        ));

        food.put(7, new FoodConstructor(
                7,
                "Donut",
                "$ 2.49",
                "a small fried cake of sweetened dough, typically in the shape of a ball or ring.",
                R.drawable.donut
        ));

        food.put(8, new FoodConstructor(
                8,
                "Fried Chicken",
                "$ 5.99",
                "A dish consisting of chicken pieces usually from broiler chickens which have been floured or battered and then pan-fried, deep fried, or pressure fried.",
                R.drawable.friedchicken
        ));

        food.put(9, new FoodConstructor(
                9,
                "Hot Chocolate",
                "$ 3.99",
                "A hot drink that usually made by mixing chocolate or cocoa powder and sugar with warm milk or water.",
                R.drawable.hotchocolate
        ));

        food.put(10, new FoodConstructor(
                10,
                "Hotdog",
                "$ 3.49",
                "A grilled or steamed link-sausage sandwich where the sausage is served in the slit of a partially sliced bun.",
                R.drawable.hotdog
        ));

        food.put(11, new FoodConstructor(
                11,
                "Ice Cream",
                "$ 3.99",
                "A sweetened frozen food typically eaten as a snack or dessert.",
                R.drawable.icecream
        ));

        food.put(12, new FoodConstructor(
                12,
                "Kebab",
                "$ 6.49",
                "Kebab dishes can consist of cut up or ground meat or seafood, sometimes with fruits and vegetables; cooked on a skewer over a fire, or like a hamburger on a grill, baked in a pan in an oven, or as a stew; and served with various accompaniments according to each recipe.",
                R.drawable.kebab
        ));

        food.put(13, new FoodConstructor(
                13,
                "Meat",
                "$ 6.99",
                "The flesh or other edible parts of animals (usually domesticated cattle, swine, and sheep) used for food, including not only the muscles and fat but also the tendons and ligaments.",
                R.drawable.meat
        ));

        food.put(14, new FoodConstructor(
                14,
                "Pizza",
                "$ 7.99",
                "A dish of Italian origin, consisting of a flat round base of dough baked with a topping of tomatoes and cheese, typically with added meat, fish, or vegetables.",
                R.drawable.pizza
        ));

        food.put(15, new FoodConstructor(
                15,
                "Taco",
                "$ 4.99",
                "A Mexican dish consisting of a folded or rolled tortilla filled with various mixtures, such as seasoned mince, chicken, or beans.",
                R.drawable.taco
        ));

        food.put(16, new FoodConstructor(
                16,
                "Waffle",
                "$ 7.49",
                "A dish made from leavened batter or dough that is cooked between two plates that are patterned to give a characteristic size, shape, and surface impression.",
                R.drawable.waffle
        ));

    }
}
