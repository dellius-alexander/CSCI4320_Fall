import edu.clayton.csit.antlab.pkg1.AntLabMain;
import org.junit.jupiter.api.Test;

public class AntLabMainTest {

    @Test
    public void AntLabMainTestSuite()
    {
        System.out.printf("\n#####################   AntLabMainTest   ###################\n");
        new AntLabMain().printOutMessage();
        System.out.printf("\n############################################################\n");
    }
}
