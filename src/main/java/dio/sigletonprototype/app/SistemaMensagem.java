package dio.sigletonprototype.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente teamTech;
    public void enviarMsgCadastro(){
        System.out.println(noreply);
        System.out.println("Cadastro criado com sucesso !!!");
    }

    public void enviarMsgBemVindo(){
        teamTech.setEmail("techteam@dio.com");
        System.out.println(teamTech);
        System.out.println("Bem vindo a DIO");
    }
}
