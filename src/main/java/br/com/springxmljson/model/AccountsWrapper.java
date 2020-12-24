package br.com.springxmljson.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accounts")
@XmlAccessorType(XmlAccessType.FIELD)
public class AccountsWrapper {
    
    @XmlElement(name = "Account")
    List<Account> accounts;

    public List<Account> getAcc() {
        return accounts;
    }

    public void setAcc(List<Account> accItem) {
        this.accounts = accItem;
    }

    @Override
    public String toString() {
        return "AccountsWrapper [accounts=" + accounts + "]";
    }   
    
}
