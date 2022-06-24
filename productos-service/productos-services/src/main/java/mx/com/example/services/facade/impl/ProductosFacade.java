package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IProductosFacade;
import mx.com.example.services.service.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductosFacade implements IProductosFacade {

    @Autowired
    private IProductosService productosService;

    public List<UserTO> getAllUsers() {
        return this.productosService.getUsers();
    }
}
