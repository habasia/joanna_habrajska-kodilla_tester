public class Notebook {
    String weight;
    int price;
    int year;
    public Notebook(String weight, int price, int year) { //konstruktor
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
            // https://www.youtube.com/watch?v=C3mTSXIMumY very very cheap
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        this.weight = this.weight.substring(0, weight.length() - 1);
        int weightInt = Integer.parseInt(weight);

        if (weightInt < 800) {
            System.out.println("This notebook is very light");
        } else if (weightInt >= 800 && weightInt <= 1200) {
            System.out.println("The weiegt is alrighty.");
        } else {
            System.out.println("This notebook is some heavy shit.");
        }
    }

    public void checkYear() {
        if (this.year >= 2018) {
            System.out.println("This notebook is almost as new");
            // https://www.youtube.com/watch?v=C3mTSXIMumY very very cheap
        } else if (this.price < 2018 && this.price >= 2010) {
            System.out.println("This notebook is not that old.");
        } else {
            System.out.println("This notebook is older than your mother.");
        }
    }

    public void checkIfWorthIt() {
        if (this.year >= 2018 && this.price <= 1500) {
            System.out.println("Good deal!");
        } else if (this.year <= 2018 && this.price > 1500) {
            System.out.println("Hell of a price for such an old junk.");
        } else {
            System.out.println("Fair enough");
        }
    }

}

