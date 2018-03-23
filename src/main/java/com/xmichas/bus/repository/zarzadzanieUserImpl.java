package com.xmichas.bus.repository;

import com.xmichas.bus.fun.zarzadzanieUser;
import com.xmichas.bus.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class zarzadzanieUserImpl implements zarzadzanieUser {
    @Override
    public User zaloguj(String login, String haslo, List<User> listOfUser) {
        for(User i : listOfUser){
            if(null!=i.getLogin() && i.getLogin().equals(login)){
                if(null!=i.getHaslo() &&i.getHaslo().equals(haslo)){
                    i.setZalogowany(true);
                    return i;
                }
            }

        }
        return null;
    }
}
