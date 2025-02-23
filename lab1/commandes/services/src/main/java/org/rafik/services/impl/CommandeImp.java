package org.rafik.services.impl;

import org.rafik.services.ICommande;
import org.springframework.stereotype.Service;

@Service
public class CommandeImp implements ICommande {
    @Override
    public String getCommand() {
        return "Commande de vehicules";
    }
}
