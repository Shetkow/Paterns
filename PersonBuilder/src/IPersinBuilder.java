public interface IPersinBuilder {
    PersonBuilder setFirstName(String Firstname);
    PersonBuilder setSecondName(String secondName);
    PersonBuilder setAge(int age);
    PersonBuilder setAdress(String adress);
    Person build ();
}
