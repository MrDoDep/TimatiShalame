package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void notNullValue(){
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss(), "null не допустимо");
    }
    @Test
    public void validName(){
        Account account = new Account("Joni Dep");
        assertTrue(account.checkNameToEmboss(), "Имя должно быть допустимо");
    }
    @Test
    public void firstSpace(){
        Account account = new Account(" DownTown");
        assertFalse(account.checkNameToEmboss(), "Пробел в начале не допустим");
    }
    @Test
    public void secondSpace(){
        Account account = new Account("DownTown ");
        assertFalse(account.checkNameToEmboss(), "Пробел в конце не допустим");
    }
    @Test
    public void emptyStringOrOnlySpace(){
        Account account1 = new Account("");
        Account account2 = new Account("  ");
        assertFalse(account1.checkNameToEmboss(), "Пустая строка не допустима");
        assertFalse(account2.checkNameToEmboss(), "Только пробелы не допустимы");
    }
    @Test
    public void shouldReturnFalseForTooShort(){
        Account account = new Account("Do");
        assertFalse(account.checkNameToEmboss(), "Два символа не допустимо");
    }
    @Test
    public void shouldReturnFalseForTooLong(){
        Account account = new Account("asdasdasdasd asdasds");
        assertFalse(account.checkNameToEmboss(),"Больше 19 сиволов не допустимо");
    }
    @Test
    void shouldReturnFalseWhenNoSpaceInName() {

        Account account = new Account("Ivan");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void shouldReturnFalseWhenMultipleSpacesInName() {

        Account account = new Account("Ivan Ivanov Jr");
        assertFalse(account.checkNameToEmboss());
    }
}
