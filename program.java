import java.util.ArrayList;
import java.util.Scanner;

public class program{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] firm = {"Tissot", "Swatch","Casio"};
        Object[][] model = {{firm[0],firm[0],firm[0],firm[1],firm[1],firm[2],firm[2]},{"T-Classic","T-Lady","T-Sport","Originals","Irony","Vintage","G-Shock"}};
        ArrayList<ArrayList<String>> clients = new ArrayList<>();

        ArrayList<String> userArray = new ArrayList<>();

        System.out.println("Введите свои ФИО");
        String fio = sc.nextLine();
        userArray.add(fio);

        System.out.println("Введите свою почту");
        String email = sc.nextLine();
        userArray.add(email);

        System.out.println("Введите свой телефон");
        String phone = sc.nextLine();
        userArray.add(phone);

        System.out.println("Выберите товар(выберите число)");
        for(int i = 0; i < 7; i++){
            String watch = (i + 1) + " " + model[0][i].toString()+" "+model[1][i].toString();
            System.out.println(watch);
        }
        int choose = sc.nextInt();
        String choosedWatch;
        if(choose > 7){
            System.out.println("Число больше 7. Выбрана последняя модель в списке");
            choosedWatch = model[0][6].toString() + " " + model[1][6].toString();
        }
        else if(choose<1){
            System.out.println("Число меньше 1. Выбрана первая модель в списке");
            choosedWatch = model[0][0].toString() + " " + model[1][0].toString();
        }
        else{
            choosedWatch = model[0][choose-1].toString() + " " + model[1][choose-1].toString();
        }
        userArray.add(choosedWatch);

        System.out.println("Введите количество выбранного товара");
        String num;
        num = sc.next();
        userArray.add(num);

        clients.add(userArray);

        System.out.println(userArray);

        System.out.println("Сделать еще один заказ?");
        System.out.println("1. Да");
        System.out.println("2. Нет");
        choose = 0;
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                main(null);
                break;
            default:
                System.exit(0);
                break;
        }
    }
}