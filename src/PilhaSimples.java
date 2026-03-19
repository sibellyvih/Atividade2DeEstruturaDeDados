import javax.swing.*;

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
        return i;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.pilha.length; i++) {
            if (this.pilha[i] != null) {
                return false;
            }
        }
        return true;
    }

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
    }

    @Override
    public int empilhar(String elementoInserido) {
        int quantidadeAtualTotal = 0;

        if (!estaCheia()){
            pilha[encontrarPosicaoVazia()] = elementoInserido;
            System.out.println("Elemento "+ elementoInserido +" adicionado com sucesso!");
            for (int i = 0; i < pilha.length; i++){
                if (pilha[i] != null){
                    quantidadeAtualTotal++;
                }
            }
        } else {
            System.out.println("Pilha cheia! Não é possível inserir.");
        }

        System.out.println("Quantidade total de elementos atualizada: " + quantidadeAtualTotal);
        return quantidadeAtualTotal;
    }

    @Override
    public int desempilhar() {
        int quantidadeAtualTotal = 0;

        System.out.println("Desempilhando um elemento da fila...");
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
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != null) {
                quantidadeAtualTotal++;
            }
        }
        System.out.println("Quantidade total de elementos atualizada: " + quantidadeAtualTotal);
        return quantidadeAtualTotal;
    }

    @Override
    public void exibir() {
        System.out.println("\nExibindo pilha estática: ");
        for (int i = pilha.length-1; i >= 0; i--){
            System.out.println("         " + pilha[i]);
        }
    }

    @Override
    public int empilharVarios(String[] elementos) {
        int qntElementosEmpilhados = 0;

        if (!estaCheia()){
            for (int i = 0; i < elementos.length; i++){
                pilha[encontrarPosicaoVazia()] = elementos[i];
                System.out.println("Elemento "+ elementos[i] + " adicionado com sucesso!");
                qntElementosEmpilhados++;
            }
        } else {
            System.out.println("Não é possível empilhar elementos!");
        }

        System.out.println("Foram empilhados " + qntElementosEmpilhados + " elementos.");
        return qntElementosEmpilhados;
    }

    @Override
    public int desempilharVarios(int qntDeElementosDesempilhados) {
        int quantidadeAtualTotal = 0;

        for (int i = 0; i < pilha.length; i++){
            if (pilha[i] != null){
                quantidadeAtualTotal++;
            }
        }

        if (!estaVazio()){
            if (qntDeElementosDesempilhados > 0 && qntDeElementosDesempilhados < quantidadeAtualTotal){
                System.out.println("Desempilhando " + qntDeElementosDesempilhados + " elemento(s).");
                for (int i = pilha.length - 1; i >= 0; i--) {
                    if (pilha[i] != null) {
                        System.out.println("Desempilhando "+ pilha[i] +" da pilha...");
                        pilha[i] = null;
                        qntDeElementosDesempilhados--;
                        if (qntDeElementosDesempilhados <= 0){
                            return quantidadeAtualTotal;
                        }
                    }
                }
            } else {
                System.out.println("Quantidade inválida!");
            }
        }
        return quantidadeAtualTotal;
    }
}