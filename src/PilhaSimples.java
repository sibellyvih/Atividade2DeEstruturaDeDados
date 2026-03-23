public class PilhaSimples implements PilhaOperacoes {
    String[] pilha;

    private boolean estaCheia() {
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] == null) {
                return false;
            }
        }
        System.out.println("A pilha está cheia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int calcularQntAtual() {
        int quantidadeAtualTotal = 0;
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != null) {
                quantidadeAtualTotal++;
            }
        }
        return quantidadeAtualTotal;
    }

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
    }

    @Override
    public int empilhar(String elementoInserido) {

        if (!estaCheia()) {
            pilha[encontrarPosicaoVazia()] = elementoInserido;
            System.out.println("Elemento " + elementoInserido + " adicionado com sucesso!");
        } else {
            System.out.println("Pilha cheia! Não é possível inserir.");
        }

        System.out.println("Quantidade total de elementos atualizada: " + calcularQntAtual());
        return calcularQntAtual();
    }

    @Override
    public int desempilhar() {

        System.out.println("Desempilhando um elemento da pilha...");
        if (!estaVazio()) {
            for (int i = pilha.length - 1; i >= 0; i--) {
                if (pilha[i] != null) {
                    pilha[i] = null;
                    break;
                }
            }
        } else {
            System.out.println("Pilha está vazia!");
        }

        System.out.println("Quantidade total de elementos atualizada: " + calcularQntAtual());
        return calcularQntAtual();
    }

    @Override
    public void exibir() {
        System.out.println("\nExibindo pilha estática: ");
        for (int i = pilha.length - 1; i >= 0; i--) {
            System.out.println("         " + pilha[i]);
        }
    }

    @Override
    public int empilharVarios(String[] elementos) {
        int qntElementosEmpilhados = 0;

        for (int i = 0; i < elementos.length; i++) {
            if (!estaCheia()) {
                pilha[encontrarPosicaoVazia()] = elementos[i];
                System.out.println("Elemento " + elementos[i] + " adicionado ao topo com sucesso!");
                qntElementosEmpilhados++;
            }
        }
        System.out.println("Foram empilhados " + qntElementosEmpilhados + " elementos.");
        return qntElementosEmpilhados;
    }

        @Override
        public int desempilharVarios (int qntDeElementosDesempilhados){

            if (!estaVazio()) {
                if (qntDeElementosDesempilhados > 0 && qntDeElementosDesempilhados <= calcularQntAtual()) {
                    System.out.println("Desempilhando " + qntDeElementosDesempilhados + " elemento(s).");
                    for (int i = pilha.length - 1; i >= 0; i--) {
                        if (pilha[i] != null) {
                            System.out.println("Desempilhando " + pilha[i] + " da pilha...");
                            pilha[i] = null;
                            qntDeElementosDesempilhados--;
                            if (qntDeElementosDesempilhados <= 0) {
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Quantidade inválida!");
                }
            }

            System.out.println("Quantidade total de elementos atualizada: " + calcularQntAtual());

        return calcularQntAtual();
    }
}