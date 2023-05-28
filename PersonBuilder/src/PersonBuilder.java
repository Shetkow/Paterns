public class PersonBuilder implements IPersinBuilder {

    protected String firstName;
    protected String secondName;
    protected int age;
    protected String adress;

    @Override
    public PersonBuilder setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Unacceptable name");
        } else {
            this.firstName = firstName;
        }
        return this;
    }

    @Override
    public PersonBuilder setSecondName(String secondName) throws IllegalArgumentException {
        if (secondName == null || secondName.isEmpty()) {
            throw new IllegalArgumentException("Unacceptable SecondName");
        } else {
            this.secondName = secondName;
        }
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Unacceptable age");
        } else {
            this.age = age;
        }
        return this;
    }

    @Override
    public PersonBuilder setAdress(String adress) throws IllegalArgumentException{
        if (adress == null || adress.isEmpty() ){
            throw new IllegalArgumentException("Unacceptable adress");
        }else{
            this.adress = adress;
        }
        return this;
    }

    @Override
    public Person build() {
        Person newPerson ;
        if(age < 0){
            newPerson = new Person(firstName,secondName);
        }else {
            newPerson = new Person(firstName,secondName,age);
        }
        newPerson.setAdress(adress);
        return newPerson;
    }
}
