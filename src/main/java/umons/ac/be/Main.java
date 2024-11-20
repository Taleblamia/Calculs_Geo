package umons.ac.be;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int result = addition.add(5, 3);
        System.out.println("Le résultat de l'addition est : " + result);
    }
}
