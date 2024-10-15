public class Main{
    public static void main(String[] args){
        Book B1 = new Book("IT", 2022, "Khanh", "161006");
        Magazine M1 = new Magazine("CE", 2024, 222222, "Dung IC");

        B1.getDetails();
        System.out.println();
        M1.getDetails();
    }
}