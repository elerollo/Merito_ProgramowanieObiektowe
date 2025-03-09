public class Main {
    public static void main(String[] args) throws Exception {
        // 1.1 Book
        Book book = new Book("Can't Hurt Me","Goggins David",299);
        System.out.println(book.isThick());

        // 1.2 Lamp
        Lamp lamp = new Lamp();
        lamp.turnOn();
        System.out.println(lamp.getStatus());

        // 1.3 Dog
        Dog chmurka = new Dog("Chmurka", 1);
        Dog piorun = new Dog("Piorun", 2);
        chmurka.bark();
        piorun.bark();

        // 1.4 Movie
        Movie movie = new Movie("Can't Hurt Me","horror",7.1);
        System.out.println(movie.isRecommended());

        // 1.5 Car
        Car audi = new Car("Audi", "RS3");
        audi.refuel(4.5);
        audi.drive(20.0);

        // 1.6 Student
        Student indeks22633 = new Student("Eryk", 5.1);
        System.out.println(indeks22633.hasPassed());

        // 1.7 Clock
        Clock clock = new Clock(23,50);
        clock.addMinutes(5000);
        clock.displayTime();

        // 1.8 Message
        Message message = new Message("Hello World!");
        System.out.println(message.getLength());

        // 1.9 Counter
        Counter counter = new Counter();
        counter.increment();
        counter.decrement();
        counter.reset();
        System.out.println(counter.getStatus());
    }
}
