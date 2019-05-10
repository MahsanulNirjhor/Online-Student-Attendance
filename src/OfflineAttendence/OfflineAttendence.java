package OfflineAttendence;

import model.RegistrationLogin;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class OfflineAttendence {

    public static void main(String[] mkn) {
        Scanner k = new Scanner(System.in);
        List<RegistrationLogin> listModel = new ArrayList<RegistrationLogin>();

        //System.out.println("Name: "+model.getName());
        //System.out.println("ID: "+model.getUserId());
        //System.out.println("Password: "+model.getPassword());
        //System.out.println("Contact: "+model.getContact());
        //listModel.add(model);
        //model = new RegistrationLogin(userId, password, "def", contact);
        //listModel.add(model);
        RegistrationLogin model = new RegistrationLogin();
        model.setName("War");
        model.setUserId("123");
        model.setPassword("1234");
        model.setContact("0123");
        //listModel.add(model);
        //model = new RegistrationLogin();
        //model.setName("Imteaz");
        //listModel.add(model);
        System.out.println("**************************");
        System.out.println("Give me a test number");
        int test = k.nextInt();
        int i = 0;
        if (test == 1) {

            System.out.println("Enter user id: ");
            String userId = k.next();
            System.out.println("Enter user password: ");
            String password = k.next();
            System.out.println("Enter user name: ");
            String name = k.next();
            System.out.println("Enter user contact: ");
            String contact = k.next();

            model = new RegistrationLogin(userId, password, name, contact);
            listModel.add(model);
            //i++;
        }
        if (test == 2) {
            System.out.println("Search Item :");
            String s1 = k.nextLine();
            for (RegistrationLogin l1 : listModel) {
                if (s1.equals(l1.getName())) {
                    System.out.println("I am in");
                    System.out.println("Name: " + l1.getName());
                }
            }

        }  if (test == 3) {
            System.out.println("Delete Item");
            String s1 = k.nextLine();
            for (RegistrationLogin l1 : listModel) {
                if (s1.equals(l1.getName())) {
                    System.out.println("Item removed");
                    listModel.remove(l1);
                    break;
                }
            }

        }  if (test == 4) {
            for (RegistrationLogin l1 : listModel) {
                System.out.println("Name: " + l1.getName());
                System.out.println("ID: " + l1.getUserId());
                System.out.println("Password: " + l1.getPassword());
                System.out.println("Contact: " + l1.getContact() + "\n" + "*******************");
            }
        }

    }
}
