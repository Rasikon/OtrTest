package com.homework.otrtest.phone;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void printNumbers() {
        PhoneBook.printNumbers("Васильев Д.В.");
    }

    @Test(expected = AssertionError.class)
    public void getNotExist() {
        Assert.assertNotNull(PhoneBook.getPhonebook().get("Васильев Д.В."));
    }

    @Test
    public void getExist() {
        Assert.assertTrue(PhoneBook.getPhonebook().containsKey("Петров П.П."));
        Assert.assertTrue(PhoneBook.getPhonebook().containsKey("Сидоров С.С."));
        Assert.assertTrue(PhoneBook.getPhonebook().containsKey("Иванов И.И."));
    }

}