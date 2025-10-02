

import java.util.ArrayList;
import java.util.List;

public class DebtorsCreditors {
    private List<Person> persons;

    public DebtorsCreditors(List<Person> persons){
        this.persons = persons;
    }

    private double durchschnitt() {
        return persons.stream().mapToDouble(Person::getGezahlt).sum() / persons.size();
    }

    private void setBalance(Person person){
        person.setBalance(person.getGezahlt() - durchschnitt());
    }

    public List<Person> debtors(){
        List<Person> debtors = new ArrayList<>();


        for (Person person : persons){
            setBalance(person);
            if (person.getBalance() < 0){
                debtors.add(person);
            }
        }
        return debtors;
    }

    public List<Person> creditors(){
        List<Person> creditors = new ArrayList<>();


        for (Person person : persons){
            setBalance(person);
            if (person.getBalance() > 0){
                creditors.add(person);
            }
        }
        return creditors;
    }
}
