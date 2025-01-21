//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.abs(-88));

        String[] vect = new String[] {"Daniel San", "fernando", "jessica"};

        for(String name : vect) {
            System.out.println(name);
        }
    }
}