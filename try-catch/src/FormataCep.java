public class FormataCep {
    public static void main(String[] args) {
        try{
            String cepFormatado = formataCep("78565g623");
            System.out.println(cepFormatado);
        }
        catch(CepInvalidoException e){
            e.printStackTrace();
        }
        
    };
    static String formataCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "78.56.56.23";
    }
}
