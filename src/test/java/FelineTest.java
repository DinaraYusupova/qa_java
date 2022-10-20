import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals("Список еды не подходит этому виду","[Животные, Птицы, Рыба]",feline.eatMeat().toString());
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Тип семейства не совпадает","Кошачьи",feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals("Количество котят не совпадает",1,feline.getKittens());
    }

    @Test
    public void testGetSeveralKittens() {
        Assert.assertEquals("Количество котят не совпадает",5,feline.getKittens(5));
    }
}