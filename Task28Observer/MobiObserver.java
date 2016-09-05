/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task28Observer;

/**
 *
 * @author hv
 */
public class MobiObserver extends Observer {

    public MobiObserver(Account account) {
        this.account = account;
        this.account.attach(this);
    }

    @Override
    public String update() {
        return "Mobi: Hello! Avvount was change. New balance is: " + account.getState() + " vnd";
    }

}
