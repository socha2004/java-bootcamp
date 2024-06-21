

public class SobreNome {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        double altura = Double.valueOf(args[2]);

        System.out.println("Olá me chamo " + nome + " " +  sobrenome);
        System.out.println("Minha altura é " + altura + " cm");
    }
}
