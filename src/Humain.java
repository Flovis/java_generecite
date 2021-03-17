public class Humain <S, T>{

    private T age;
    private S nom;

    public Humain(S nom, T age) {
        this.age = age;
        this.nom = nom;
    }

    public T getAge() {
        return age;
    }

    public S getNom() {
        return nom;
    }
}
