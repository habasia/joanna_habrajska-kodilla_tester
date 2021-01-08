public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g",1000,2000);
        notebookInformation(notebook);


        Notebook heavyNotebook = new Notebook("2000g",1500,2000);
        notebookInformation(heavyNotebook);


        Notebook oldNotebook = new Notebook("1200g",500,2000);
        notebookInformation(oldNotebook);
    }

    public static void notebookInformation (Notebook notebook) {
        System.out.println("Notebook weight is " + notebook.weight);
        notebook.checkWeight();

        System.out.println("Notebook price is " + notebook.price);
        notebook.checkPrice();

        System.out.println("Notebook year of production is " + notebook.year);
        notebook.checkYear();

        notebook.checkIfWorthIt();
    }
}
