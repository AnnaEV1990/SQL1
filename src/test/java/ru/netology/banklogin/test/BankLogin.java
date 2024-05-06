package ru.netology.banklogin.test;

import org.testng.annotations.Test;
import ru.netology.banklogin.page.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static ru.netology.banklogin.data.SQLHelper.cleanAuthCodes;

public class BankLogin {
    LoginPage loginPage;

    @AfterEach
    void tearDown(){
        cleanAuthCodes();
    }
    @AfterAll
    static void tearDownAll(){
        cleanDataBase();
    }
    @BeforeEach
    void setUp(){
        loginPage= open("http://localhost:9999",LoginPage.class);
    }
@Test
@DisplayName("....");
    void should

}
