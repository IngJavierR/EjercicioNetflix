package mx.com.example.services.facade;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class ProductosFacadeTest extends BaseTest {

    @Test
    public void ShouldReturnAllUsers() {

        List<UserTO> users = this.productosFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}