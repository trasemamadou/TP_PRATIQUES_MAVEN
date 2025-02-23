package org.rafik.web;

import lombok.AllArgsConstructor;
import org.rafik.services.ICommande;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CommandeController {

    private ICommande commande;

    @GetMapping(name = "commande", value = "/commande")
    public String commandeController(){
        return commande.getCommand();
    }
}
