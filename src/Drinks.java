import java.util.Scanner;

public class Drinks {
    public static final int COFFEPRICE = 10;
    public static final int TEAPRICE = 8;
    public static final int LEMONADEPRICE = 13;
    public static final int MOXITOPRICE = 15;
    public static final int WATERPRICE = 5;
    public static final int COCA_COLAPRICE = 16;
    public static int totalPrice;
    public static int amoundDrink;
    Scanner scanner = new Scanner(System.in);
    public String menu(){
        return (" Є в  наявності: " + "\n" +  DrinksMachine.COFFE + "\n" +  DrinksMachine.TEA + " \n"  +   DrinksMachine.LEMONAD + "\n" +  DrinksMachine.MOXITO + "\n" +  DrinksMachine.WATER + "\n" +  DrinksMachine.COLA);
    }

    public void coffePrepare(){
        System.out.println("Вартість чашки кави  " + COFFEPRICE + " грн" );
        System.out.println("Введіть кількість чашок кави ");
        amoundDrink = scanner.nextInt();
        totalPrice += COFFEPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice );
        System.out.println( "кількість напою " + amoundDrink );
        System.out.println("Заберіть замовлення ");


    }
    public void teaPrepare(){
        System.out.println("Вартість чашки чаю  " + TEAPRICE + " грн" );
        System.out.println("Введіть кількість чашок чаю ");
        amoundDrink = scanner.nextInt();
        totalPrice += TEAPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );

    }
    public void lemonadePrepare(){
        System.out.println("Вартість стакану лимонаду  " + LEMONADEPRICE + " грн" );
        System.out.println("Введіть кількість стаканів лемонаду  ");
        amoundDrink = scanner.nextInt();
        totalPrice += LEMONADEPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice +  "\n" );
        System.out.println("Заберіть замовлення ");
    }
    public void moxitoPrepare(){
        System.out.println("Вартість стакану мохіто  " + MOXITOPRICE + " грн" );
        System.out.println("Введіть кількість стаканів мохіто ");
        amoundDrink = scanner.nextInt();
        totalPrice += MOXITOPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");

    }
    public void waterPrepare(){
        System.out.println("Вартість пляшки води " + WATERPRICE + " грн" );
        System.out.println("Введіть кількість пляшок води ");
        amoundDrink = scanner.nextInt();
        totalPrice += WATERPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");
    }
    public void cocaColaPrepare(){
        System.out.println("Вартість банки  коли  " + COCA_COLAPRICE + " грн" );
        System.out.println("Введіть кількість банок коли ");
        amoundDrink = scanner.nextInt();
        totalPrice += COCA_COLAPRICE * amoundDrink;
        System.out.println("Сумма замовлення " + totalPrice+  "\n" );
        System.out.println("Заберіть замовлення ");
    }


    public int totalPrice() {
        return  totalPrice;

    }
}
