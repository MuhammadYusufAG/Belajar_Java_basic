public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Muhammad Yusuf";

        int age = 19;
        String address = "Indonesia";


        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

//        mengganti variable
        name = "Agus buntung";
        System.out.println(name);

//        Use var
        var firstName = "M Yusuf";
        var middleName = "Abdul";
        var lastName = "Ghany";

//        tidak bisa seperti dibawah ini
//        var name;
//        name = "agus"


//        tipe data final
        final String apllication = "Belajar Java";

//        apllication = "belajar js";//error
    }
}
