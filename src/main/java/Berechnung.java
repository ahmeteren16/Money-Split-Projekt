

import java.util.ArrayList;
import java.util.List;

public class Berechnung {

    private List<Person> creditors;
    private List<Person> debtors;

    public Berechnung(List<Person> debitors, List<Person> creditors){
        this.debtors = debitors;
        this.creditors = creditors;
    }

    public List<Uberweisung> Uberweisungen(){
        List<Uberweisung> result = new ArrayList<>();
        for (Person debtor : debtors) {
            for (Person creditor : creditors) {
                if (debtor.getBalance() == 0) break;

                double amount = Math.min(-debtor.getBalance(), creditor.getBalance());
                if (amount > 0) {
                    result.add(new Uberweisung(debtor.getName(), creditor.getName(), amount));
                    debtor.setBalance(debtor.getBalance() + amount);
                    creditor.setBalance(creditor.getBalance() - amount);
                }
            }
        }
        return result;
    }



}
