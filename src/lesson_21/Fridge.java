package lesson_21;

import java.util.HashMap;


public class Fridge {
    //fields

    HashMap<String, Integer> products = new HashMap<>();

    //constructors

    public Fridge() { // по умолчанию можно не прописывать
    }


    //methods
    public void putProduct(String product, int value) { // кладем
        // есть-ли такой продукт в холодильнике
        if (products.containsKey(product)) { //если он есть
            products.put(product, value + products.get(product));
        } else {//если его нет
            products.put(product, value);
        }
    }
        public void getProduct (String product, int value){ // берем
            //Если продукта нет вообще в холодильнике
            if (!products.containsKey(product)) { //если его нет
                System.out.println("Такого продукта нет в холодильнике" + product);
                return;
            }
                //если продукта не хватает

                // продукта хватает ровно столько, сколько берут
            if (value==products.get(product)){
                System.out.println("продукта столько, сколько нужно "+ product + "" + products.get(product));
                return;
            }
                // если продукта больше в холодильнике чем берут
            products.put(product, products.get(product)-value);
            System.out.println("Продукта осталось " + (products.get(product)-value)+ " и нам хватило!");


            }
        }


