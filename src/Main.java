import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,password,newPassword,passwordReset;

        Scanner inp=new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz: ");
        userName=inp.nextLine();

        System.out.println("Parolanizi Giriniz: ");
        password=inp.nextLine();

        if(userName.equals("patika")&&password.equals("dev123")){
            System.out.println("Giris Basarili.");

        }else{

            System.out.println("Giris Basarisiz Yeni Sifre alinsin mi");
            passwordReset=inp.nextLine();


            if (passwordReset.equals("no")){
                System.out.println("Giris Sonlandirildi.");


            }else if(passwordReset.equals("yes")){
                System.out.println("Lutfen Yeni Sifrenizi Giriniz.");
                newPassword=inp.nextLine();

                if(newPassword.equals("dev123")){
                    System.out.println("Eski Sifre Kullandiniz Tekrar Deneyiniz");
                }else{
                    System.out.println("Yeni Sifreniz Basarili");
                }


            }
            else{
                System.out.println("Program Sonlandirilmistir");
            }

        }




    }
}
