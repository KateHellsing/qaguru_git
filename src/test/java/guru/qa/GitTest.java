package guru.qa;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitTest {


    @Test
    //изменение 1
    void yandexTest() {
        Selenide.open("https://ya.ru");
    }
}


