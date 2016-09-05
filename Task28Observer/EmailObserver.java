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
public class EmailObserver extends Observer {
    public EmailObserver(Account account){
        this.account = account;
        this.account.attach(this);
    }

    @Override
    public String update() {
        return "Email: ABC Bank welcome customers! Account was change.\n Now Balace is: " + account.getState() + "vnd";
    }

    

}
