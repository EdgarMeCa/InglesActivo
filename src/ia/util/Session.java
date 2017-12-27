/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

/**
 *
 * @author ASUS
 */
public class Session {
    
    private static Session session = null;
    private String username = "";

    private Session() {
        
    }
    
    public Session getInstance() {
        if(session == null)
        {
            session = new Session();
        }
        return session;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
