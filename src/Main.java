import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      String userName;
      String passWord;
        System.out.print("Enter Username: ");
        userName=scanner.nextLine();
        System.out.print("Enter PassWord: ");
        passWord=scanner.nextLine();

        if (passWord.equals("123"))
        {
            System.out.println("** Welcome **");
        }

             else if (passWord.equals("1234")) {
            System.out.println("** Welcome **");
        }
            else{
                System.out.println("** Pleasr Enter True INFO **");


        }
            try {
        String FLOWER;
        System.out.println("Enter the type of Flowers");
        FLOWER=scanner.nextLine();
        switch (FLOWER)
        {case "ورد جوري":
            System.out.println("متوفر بالون الاحمر والزهري");
            break;
            case "زنبق":
            System.out.println("متوفر بالون الابيض والاصفر");
            break;
            case "ياسمين":
                System.out.println("متوفر بالون الابيض");
                break;
            case "توليب":
                System.out.println("متوفر اللون الأرجواني واللون الأصفر");
                break;
            case "أقحوان":
                System.out.println("متوفر باللون الاصفر والوردي ");
                break;
            case "لافندر":
                System.out.println("متوفر باللون خزامي أزرق و خزامي رمادي  ");
                break;
            case "زهرة الأوركيد":
                System.out.println("متوفر باللون الوردي والبنفسجي");
                break;
            case "زهرة الثلج":
                System.out.println("متوفر باللون الابيض ");
                break;
            case "شقائق النعمان":
                System.out.println("متوفر باللون القرنفلي و الارجواني");
                break;

            default:
                System.out.println("عذرا فقط هذا الانواع متوفرة ");

        }}
            catch (Exception a)
            {
                System.out.println("اسف ليس هناك النوع الذي تريده");
            }



        }
    }
