import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    /**
     * Type variables are double and int
     */
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 3500; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args)
    {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);

        //Type variable is int
        int carsCount = scanner.nextInt();

        //Type variable is int
        for(int i = 0; i < carsCount; i++)
        {
            //Type variable is Car (class)
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            //Type variable is int
            int price = calculatePrice(car);
            if(price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car)
    {
        //Type variable is int
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight)
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }

        //грузовой автомобиль
        else if (carHeight > passengerCarMaxHeight || car.weight > passengerCarMaxWeight)
        {
            price = cargoCarPrice;
        }

        //легковой автомобиль
        else {
            price = passengerCarPrice;
        }

        //наличие прицепа
        if (car.hasVehicle){
            price = price + vehicleAdditionalPrice;
        }

        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }


    /**
     * Getters and Setters
     */
    public static void setPassengerCarMaxWeight(double weight) {
        passengerCarMaxWeight = weight;
    }
    public static double getPassengerCarMaxWeight() {
        return passengerCarMaxWeight;
    }

    public static void setPassengerCarMaxHeight(int height) {
        passengerCarMaxHeight = height;
    }
    public static int getPassengerCarMaxHeight() {
        return passengerCarMaxHeight;
    }

    public static void setControllerMaxHeight(int height) {
        controllerMaxHeight = height;
    }
    public static int getControllerMaxHeight() {
        return controllerMaxHeight;
    }

    public static void setPassengerCarPrice(int price) {
        passengerCarPrice = price;
    }
    public static int getPassengerCarPrice() {
        return passengerCarPrice;
    }

    public static void setCargoCarPrice(int price) {
        cargoCarPrice = price;
    }
    public static int getCargoCarPrice() {
        return cargoCarPrice;
    }

    public static void setVehicleAdditionalPrice(int price) {
        vehicleAdditionalPrice = price;
    }
    public static int getVehicleAdditionalPrice() {
        return vehicleAdditionalPrice;
    }
}