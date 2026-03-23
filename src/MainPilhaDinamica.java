public class MainPilhaDinamica {
    static void main() {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        System.out.println("PILHA DINÂMICA");

        System.out.println("\n-----EMPILHANDO UNITARIAMENTE-----");
        pilhaDinamica.empilhar("A");
        pilhaDinamica.empilhar("B");
        pilhaDinamica.empilhar("C");
        pilhaDinamica.empilhar("D");
        pilhaDinamica.exibir();

        System.out.println("\n-----DESEMPILHANDO UM ELEMENTO-----");
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();

        System.out.println("\n-----EMPILHANDO VÁRIOS ELEMENTOS-----");
        pilhaDinamica.empilharVarios(new String[]{"D", "E", "F"});
        pilhaDinamica.exibir();

        System.out.println("\n-----DESEMPILHANDO VÁRIOS ELEMENTOS-----");
        pilhaDinamica.desempilharVarios(2);
        pilhaDinamica.exibir();
    }
}
