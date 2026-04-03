import model.Kit;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 80);
        Produto teclado = new Produto("Teclado", 150);
        Produto monitor = new Produto("Monitor", 900);
        Produto mousepad = new Produto("Mousepad", 40);

        Kit kit1 = new Kit("Kit Periféricos");
        kit1.adiconar(mouse);
        kit1.adiconar(teclado);
        kit1.adiconar(mousepad);

        Kit kit2 = new Kit("Kit Setup");
        kit2.adiconar(monitor);
        kit2.adiconar(kit1);

        kit1.exibir("");
        kit2.exibir("");

    }
}
