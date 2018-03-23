package com.xmichas.bus.fun;

import com.xmichas.bus.model.User;

import java.util.List;

public interface zarzadzanieUser {
    User zaloguj(String login, String haslo, List<User> listOfUser);

}
