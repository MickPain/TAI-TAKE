public class Main {
    public static void main(String[] args) {
        Cars Chevrolet = new Cars();
        Chevrolet.Brand = " Chevrolet";
        Chevrolet.engpower = 250;
        Chevrolet.owner = "Oleg";
        Chevrolet.price = 3500;
        Chevrolet.year = 2000;

        Cars Alfaromeo = new Cars();
        Alfaromeo.Brand = "Alfaromeo";
        Alfaromeo.engpower = 400;
        Alfaromeo.owner = "Anna";
        Alfaromeo.price = 30000;
        Alfaromeo.year = 2016;

        Cars Subaru = new Cars();
        Subaru.Brand = "Subaru";
        Subaru.engpower = 500;
        Subaru.owner = "Vasya";
        Subaru.price = 20000;
        Subaru.year = 2015;

        Cars Skoda = new Cars();
        Skoda.Brand = "Skoda";
        Skoda.engpower = 300;
        Skoda.owner = "Roman";
        Skoda.price = 9000;
        Skoda.year = 2003;

        Cars Toyota = new Cars();
        Toyota.Brand = " Toyota";
        Toyota.engpower = 350;
        Toyota.owner = "Andriy";
        Toyota.price = 9000;
        Toyota.year = 2005;

        Cars Suzuki = new Cars();
        Suzuki.Brand = "Suzuki";
        Suzuki.engpower = 280;
        Suzuki.owner = "Ivan";
        Suzuki.price = 5000;
        Suzuki.year = 2004;

        Cars Audi = new Cars();
        Audi.Brand = "Audi";
        Audi.engpower = 330;
        Audi.owner = "Nadiya";
        Audi.price = 8000;
        Audi.year = 2001;

        Cars BMW = new Cars();
        BMW.Brand = "BMW";
        BMW.engpower = 300;
        BMW.owner = "Yura";
        BMW.price = 5000;
        BMW.year = 1999;

        Cars Honda = new Cars();
        Honda.Brand = "Honda";
        Honda.engpower = 300;
        Honda.owner = "Valera";
        Honda.price = 4000;
        Honda.year = 2002;

        Cars Ford = new Cars();
        Ford.Brand = "Ford";
        Ford.engpower = 290;
        Ford.owner = "Petro";
        Ford.price = 6500;
        Ford.year = 2003;


        System.out.println(Chevrolet);
        System.out.println(Alfaromeo);
        System.out.println(Subaru);
        System.out.println(Skoda);
        System.out.println(Toyota);

// ремонтуємо мотори в половини авто
        Chevrolet.engpower = 275;
        Alfaromeo.engpower = 440;
        Subaru.engpower = 550;
        Skoda.engpower = 330;
        Toyota.engpower = 385;


        System.out.println(Chevrolet);
        System.out.println(Alfaromeo);
        System.out.println(Subaru);
        System.out.println(Skoda);
        System.out.println(Toyota);


// наймаємо нових водіїв на ремонтовані авто
        Chevrolet.owner = "Sasha";
        Alfaromeo.owner = " Lera";
        Subaru.owner = "Roman";
        Skoda.owner = " Pavlo";
        Toyota.owner = "Grisha";


        System.out.println(Chevrolet);
        System.out.println(Alfaromeo);
        System.out.println(Subaru);
        System.out.println(Skoda);
        System.out.println(Toyota);
        System.out.println(Suzuki);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Honda);
        System.out.println(Ford);


        System.out.println(Chevrolet.price + Alfaromeo.price + Subaru.price + Skoda.price + Toyota.price + Suzuki.price + Audi.price + BMW.price + Honda.price + Ford.price);
    }
}
