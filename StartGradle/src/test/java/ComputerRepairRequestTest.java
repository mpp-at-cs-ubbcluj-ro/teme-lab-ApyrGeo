import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest request = new ComputerRepairRequest();
        assertEquals( "", request.getOwnerAddress());
        request.setOwnerAddress("ABCD");
        assertEquals( "ABCD", request.getOwnerAddress());
    }


    @Test
    @DisplayName("Second Test")
    public void testExample2(){
        assertEquals(2+2, 4, "Tre sa mearga");
    }
}
