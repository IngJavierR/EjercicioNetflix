package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IOrdenesFacade;
import mx.com.example.services.service.IOrdenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class OrdenesFacade implements IOrdenesFacade {

    @Autowired
    private IOrdenesService ordenesService;

    public List<UserTO> getAllUsers() {
        return this.ordenesService.getUsers();
    }
}
