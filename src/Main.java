//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PilhaSimples pilhaSimples = new PilhaSimples(10);

    System.out.println("PILHA SIMPLES");

    System.out.println("\n-----EMPILHANDO UNITARIAMENTE-----");
    pilhaSimples.empilhar("A");
    pilhaSimples.empilhar("B");
    pilhaSimples.empilhar("C");
    pilhaSimples.empilhar("D");

    pilhaSimples.exibir();

    System.out.println("\n-----DESEMPILHANDO UM ELEMENTO-----");
    pilhaSimples.desempilhar();
    pilhaSimples.exibir();

    System.out.println("\n-----EMPILHANDO VÁRIOS-----");
    pilhaSimples.empilharVarios(new String[]{"D", "E", "F"});
    pilhaSimples.exibir();

    System.out.println("\n-----DESEMPILHANDO VÁRIOS ELEMENTOS-----");
    pilhaSimples.desempilharVarios(2);
    pilhaSimples.exibir();
}
