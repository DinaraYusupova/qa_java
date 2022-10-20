import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        Assert.assertEquals("Список еды не подходит этому виду","[Животные, Птицы, Рыба]",cat.getFood().toString());

    }

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Кошка должна говорить Мяу","Мяу",cat.getSound());
    }

}