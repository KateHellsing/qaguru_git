package guru.qa;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitTest {


    @Test
    void yandexTest() {
        //изменения 1
        Selenide.open("https://ya.ru");
    }
}


