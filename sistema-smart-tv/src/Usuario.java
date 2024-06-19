public class Usuario{
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();
       
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);
       System.out.println("ligada: " + smartTv.ligada);

       smartTv.ligar();
       smartTv.aumentarVolume(); 
       smartTv.aumentarVolume(); 
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();

       smartTv.novoCanal(50);

       System.out.println("Estado atual de ligada: " + smartTv.ligada);
       System.out.println("Volume atual: " + smartTv.volume);
       System.out.println("Canal atual: " + smartTv.canal);
    }
}
