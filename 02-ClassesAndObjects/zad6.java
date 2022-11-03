class Student {
    // atrybuty
    String imie;
    String nazwisko;
    public int wiek;
    public boolean zaoczny;
    public float sredniaOcen;

    // metody
    public void podbijLegitymacje() {
        System.out.println("Podbito legitymacje");
    }

    public void zaliczSemestr() {}

    public void displayName() {
        System.out.println(imie);
    }

    public static void main(String[] args) {
        // in terminal
        // javac zad6.java
        // java Student
        Student student1 = new Student();
        student1.podbijLegitymacje();
        student1.imie = "Jan";
        student1.displayName();
    }
}