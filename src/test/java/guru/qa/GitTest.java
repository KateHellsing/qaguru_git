package guru.qa;


import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GitTest {


    @Test
    void yandexTest() {
        Selenide.open("https://ya.ru");
    }
}


