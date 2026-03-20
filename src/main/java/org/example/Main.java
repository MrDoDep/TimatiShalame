package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Иванов Илья");
        boolean nameValid = account.checkNameToEmboss();
        System.out.println("Имя валидно: " + nameValid);

    }
}