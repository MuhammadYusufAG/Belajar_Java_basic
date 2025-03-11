public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;//value kosong = null

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

//        konversi dari data primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat2 = iniObject.floatValue();

        Long amount = 1000000L;
//        amount.floatValue();


    }
}
