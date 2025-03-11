public class Array {
    public static void main(String[] args) {

//        metode array

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "M Yusuf";
        stringArray[1] = "Abdul";
        stringArray[2] = "Ghany";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Agus";

        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "muhammad","yusuf"
        };
        namaNama[0] = null;

        int[] arrayInt = new int[]{
                 1,2,3,4,5,6,78,8,9
        };
        System.out.println(arrayInt.length);

        long[] arrayLong = {
                10L,20L,30L
        };

        arrayLong[0] = 0;

//        operasi array
        System.out.println(arrayLong.length);


//        Array didalam array
        String[][] members = {
                {"Agung","Simanjutak"},
                {"Muhammad","Yusuf"},
                {"Joko"}
        };

        //cara memanggil arraynya
        System.out.println(members[0]);//harusny memberitahu array keberapa yang dipanggil
        System.out.println(members[1][1]);
    }
}
