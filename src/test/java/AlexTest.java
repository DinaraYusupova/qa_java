import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("Список друзей Алекса не совпадает с реальным","[зебра Марти, бегемотиха Глория, жираф Мелман]",alex.getFriends().toString());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("Алекс живет в Нью-Йоркском зоопарке","Нью-Йоркский зоопарк",alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex(feline);
        Assert.assertEquals("У Алекса нет котят",0,alex.getKittens());
    }
}