public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000, 2017);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkIfWorthIt();

        Notebook heavyNotebook = new Notebook("2000g", 1500, 2020);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkIfWorthIt();

        Notebook oldNotebook = new Notebook("1200g", 500, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkIfWorthIt();

        Notebook oldAndExpensiveNotebook = new Notebook("3000g", 3000, 1999);
        System.out.println(oldAndExpensiveNotebook.weight + " " + oldAndExpensiveNotebook.price);
        oldAndExpensiveNotebook.checkPrice();
        oldAndExpensiveNotebook.checkWeight();
        oldAndExpensiveNotebook.checkYear();
        oldAndExpensiveNotebook.checkIfWorthIt();
    }
}