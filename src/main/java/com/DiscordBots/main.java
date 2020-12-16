package com.DiscordBots;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class main {
    public static JDA jda;

    public static void main(String[] args) {
        JDABuilder jb = new JDABuilder(AccountType.BOT);
        jb.setAutoReconnect(true);
        jb.setStatus(OnlineStatus.ONLINE);
        jb.setToken(args[0]);
        jb.addEventListeners(new DListener());
        try {
            main.jda = jb.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}