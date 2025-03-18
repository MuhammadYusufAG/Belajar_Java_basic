public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai){
            case "A":
                System.out.println("WOW,anda lulus dengan sempurna");
            break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
            break;
            case "D":
                System.out.println("Anda tidak lulus");
            break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }
    }
}
