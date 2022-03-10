import builder.RenovationBuilder;
import org.junit.Test;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 11:45
 * @description:
 */
public class BuilderTest {

    @Test
    public void testRenovationBuilder(){
        System.out.println(RenovationBuilder.getDeluxeSinglePackage());
        System.out.println(RenovationBuilder.getLightLuxurySinglePackage());
        System.out.println(RenovationBuilder.getVegetarian());
    }

}
