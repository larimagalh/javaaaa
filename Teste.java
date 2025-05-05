//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste {
    public static void main(String[] args) {

        Pessoa churros = new Pessoa(
                "Churros",
                60,
                1.65,


        Pessoa larissa = new Pessoa(
                "Larissa",
                57,
                1,60




        if (larissa.getPeso() > churros.getPeso()) {
            System.out.println("Larissa é mais pesado que o Churros");
        } else {
            System.out.println("Churros é mais pesado que a Larissa");
        }
        if (larissa.getAltura() > churros.getAltura()) {
            System.out.println("Larissa é maior que o Churros");
        } else {
            System.out.println("Churros é maior que a Larissa");
        }
    }
}
