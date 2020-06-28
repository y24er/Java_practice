public class VehicleTest implements Vehicle {
    public static void main(String[] args) {
        final int MONEY = 500;
        if (MONEY >= CAR_COST)
            System.out.println("可选择汽车出行");
        if (MONEY >= BUS_COST)
            System.out.println("可选择大巴出行");
        if (MONEY >= TRAIN_COST)
            System.out.println("可选择火车出行");
        if (MONEY >= PLANE_COST)
            System.out.println("可选择飞机出行");
    }
}
