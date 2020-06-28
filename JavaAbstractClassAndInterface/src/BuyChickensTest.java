public class BuyChickensTest {
    public static void main(String[] args) {
        Cock cock = new Cock(5);
        Hen hen = new Hen(3);
        Chick chick = new Chick(1.0 / 3);

        final int MONEY = 100;
        final int TOTAL_NUM = 100;

        for (int cockNum = 0; cockNum < MONEY / cock.getPrice(); cockNum++) {
            for (int henNum = 0; henNum < MONEY / hen.getPrice(); henNum++) {
                int chickNum = TOTAL_NUM - cockNum - henNum;
                if(cockNum*cock.getPrice()+henNum*hen.getPrice()+chickNum*chick.getPrice()==100){
                    System.out.println("cock:" + cockNum + ",hen:" + henNum + ",chick:" + chickNum);
                }
            }
        }
    }
}
