public class PilhaDinamica implements PilhaOperacoes{
    No topo;

    public PilhaDinamica() {
        this.topo = new No(null);
        System.out.println("Pilha dinâmica criada!");
    }

    private boolean existeInicio() {
        if(this.topo.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Empilha UM elemento na pilha.
     *
     * @param elementoInserido Elemento que deverá ser inserido.
     * @return Quantidade atual total de elementos da pilha.
     */
    @Override
    public int empilhar(String elementoInserido) {
        No novoTopo = new No(elementoInserido);

        if(topo.getConteudo() == null){
            topo = novoTopo;
            System.out.println("Elemento " + elementoInserido + " empilhado com sucesso!");
        } else {
            // se tiver inicio/topo, vai empilhar um elemento e ele se tornará o novo topo
            novoTopo.setProx(topo);
            topo = novoTopo;
            System.out.println("\nElemento " + elementoInserido + " empilhado com sucesso!");
        }

        No auxiliar = topo;
        int quantidadeElementos = 0;
        while (auxiliar != null){
            quantidadeElementos++;
            auxiliar = auxiliar.getProx();
        }

        System.out.println("A pilha possui "+ quantidadeElementos + " elementos.");
        return quantidadeElementos;
    }

    @Override
    public int desempilhar() {
        return 0;
    }

    @Override
    public void exibir() {
        No auxiliar = topo;

        if (existeInicio()){
            System.out.println("\nExibindo pilha dinâmica: ");
           while (auxiliar != null){
               System.out.println("         " + auxiliar.conteudo);
               auxiliar = auxiliar.getProx();
           }
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    @Override
    public int empilharVarios(String[] elementos) {
        return 0;
    }

    @Override
    public int desempilharVarios(int qntDeElementosDesempilhados) {
        return 0;
    }
}
