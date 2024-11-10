package trenlop;

public class Main {
    public static void searchByName(Person[] persons, String ten) {
        for (Person person : persons) {
            if (person.getTen().equalsIgnoreCase(ten)) {
                person.display();
            }
        }
    }
    public static void searchByMaCanCuocCongDan(Person[] persons, String maCanCuocCongDan) {
        for (Person person : persons) {
            if (person.getMaCanCuocCongDan().equals(maCanCuocCongDan))
                person.display();
        }
    }

    public static void main(String[] args) {
        Person[] persons=new Person[3];
        persons[0]=new Person("2023","nguyen hai duy1","phutho","0978070784",25);
        persons[1]=new Person("2043","nguyen hai duy1","phutho","0978070784",24);
        persons[2]=new Person("2023","nguyen hai duy3","pho","09780707",29);
        searchByName(persons, "nguyen hai duy1");
        searchByMaCanCuocCongDan(persons,"2023");
        System.out.println();
        for (Person person: persons) person.display();
    }
}