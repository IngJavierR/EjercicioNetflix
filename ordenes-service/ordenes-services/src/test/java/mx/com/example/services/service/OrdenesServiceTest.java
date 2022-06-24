package mx.com.example.services.service;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class OrdenesServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.ordenesService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
