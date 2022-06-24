package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IUsuariosFacade;
import mx.com.example.services.service.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UsuariosFacade implements IUsuariosFacade {

    @Autowired
    private IUsuariosService usuariosService;

    public List<UserTO> getAllUsers() {
        return this.usuariosService.getUsers();
    }
}
