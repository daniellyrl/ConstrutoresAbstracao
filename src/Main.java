import com.company.*;
public class Main {
    public static void main(String[] args){
        Gato g1 = new Gato("Ana");
        Cachorro c1 = new Cachorro("Renato");
        Passarinho p1 = new Passarinho("Carlos");

        System.out.println("O nome do gato é: " + g1.getNome() + "lindo" );
        System.out.println("seu som é: " + g1.EmitirSom());
        System.out.println("O nome do cachorro é: " + c1.getNome());
        System.out.println("O nome do passarinho é: " + p1.getNome());
    }
}
