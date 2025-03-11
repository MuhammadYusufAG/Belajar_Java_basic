public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 80;

        //if statement
//        if (nilai >= 75 && absen >=75){
//            System.out.println("Selamat anda lulus");
//        }
//        //else statement
//        else{
//            System.out.println("anda tidak lulus");
//        }

        //else if statement
        if(nilai >= 80 && absen >=80) {
            System.out.println("nilai anda A");
        } else if(nilai >= 70 && absen >=70){
            System.out.println("nilai anda B");
        } else if(nilai >= 60 && absen >=60){
            System.out.println("nilai anda C");
        } else if(nilai >= 50 && absen >=50){
            System.out.println("nilai anda D");
        } else{
            System.out.println("nilai anda E");
        }
    }
}
