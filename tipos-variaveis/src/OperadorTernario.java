public class OperadorTernario {
    public static void main(String[] args) {
        /*
         <expressaoCondicional> ? <caso condição seja True> : <caso condição seja False>
         */

        int a = 5;
        int b = 6;

        String resultado = a != b ?  "Verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
