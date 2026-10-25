package com.andreeaanghel.homework;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();


        //User valid
        try {
            repository.addUser(new User("testuser", 25));
            System.out.println("Utilizator adaugat cu succes.");
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        //AdminUser valid
        try{
            repository.addUser(new AdminUser("admin", 30, "full access"));
            System.out.println("Administrator adaugat cu succes");
        } catch (InvalidUserDataException e){
            System.out.println("Eroare" + e.getMessage());
        }

        //Username prea scurt
        try {
            repository.addUser(new User("ab", 22));
            System.out.println("Utilizator adaugat cu succes");
        } catch (InvalidUserDataException e){
            System.out.println("Nu s-a putut adauga utilizatorul: " + e.getMessage());
        }

        //Varsta negativa
        try {
            repository.addUser(new User("baduser", -5));
            System.out.println("Utilizator adaugat cu succes");
        } catch (InvalidUserDataException e){
            System.out.println("Nu s-a putut adauga utilizatorul: " + e.getMessage());
        }

        System.out.println("\nUtilizatori valizi");
        for(User user : repository.getUsers()){
            System.out.println(user);
        }
    }
}
