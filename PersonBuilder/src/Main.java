// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
 Person mom = new PersonBuilder()
                        .setFirstName("Анна")
                        .setSecondName("Вольф")
                        .setAge(31)
                        .setAdress("Сидней")
                        .build();
                Person son = mom.newChildBuilder()
                        .setFirstName("Антошка")
                        .build();
                System.out.println("У " + mom + " есть сын, " + son);

                try {
                    // Не хватает обяхательных полей
                    new PersonBuilder().build();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }

                try {
                    // Возраст недопустимый
                    new PersonBuilder().setAge(-100).build();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }

