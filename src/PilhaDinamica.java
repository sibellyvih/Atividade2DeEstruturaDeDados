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

    /**
     * Desempilha UM elemento da pilha.
     *
     * @return Quantidade atual total de elementos da pilha.
     */
    @Override
    public int desempilhar() {
        int quantidadeElementos = 0;
        No auxiliar = topo;

        if (existeInicio()){
            System.out.println("Desempilhando o elemento " + topo.getConteudo() + " do topo da pilha.");
            topo = topo.getProx();
        }

        auxiliar = topo;

        while (auxiliar != null){
            quantidadeElementos++;
            auxiliar = auxiliar.getProx();
        }

        System.out.println("A pilha possui "+ quantidadeElementos + " elementos agora.");
        return quantidadeElementos;
    }

    @Override
    public void exibir() {
        No auxiliar = topo;

        if (topo != null){
            System.out.println("\nExibindo pilha dinâmica: ");
           while (auxiliar != null){
               System.out.println("         " + auxiliar.conteudo);
               auxiliar = auxiliar.getProx();
           }
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    /**
     * Empilha VÁRIOS elementos na pilha recebidos de um vetor.
     * Para a pilha estática, se encher a pilha adiocionar apenas o que for possível.
     *
     * @param elementos Elemento que deverá ser empilhados.
     * @return Quantidade de elementos inseridos.
     */
    @Override
    public int empilharVarios(String[] elementos) {
        String novoElemento;
        int quantidadeElementosEmpilhados = 0;

        // se nao tiver topo
        if (topo.getConteudo() == null){
            topo = new No(elementos[0]);
            quantidadeElementosEmpilhados++;
            System.out.println("Elemento "+ elementos[0] + " adicionado com sucesso!");
            No auxiliar = topo;

            for (int i = 1; i < elementos.length; i++){
                No novoNo = new No(elementos[i]);
                novoNo.setProx(topo);
                topo = novoNo;
                quantidadeElementosEmpilhados++;
                System.out.println("Elemento " + elementos[i] + " adicionado com sucesso!");
            }
        } else {
            // se tiver topo
            No auxiliar = topo;

            for (int i = 0; i < elementos.length; i++){
                No novoNo = new No(elementos[i]);
                novoNo.setProx(topo);
                topo = novoNo;
                quantidadeElementosEmpilhados++;
                System.out.println("Elemento " + elementos[i] + " adicionado!");
            }
        }

        System.out.println("Total de elementos adicionados: " + quantidadeElementosEmpilhados);
        return quantidadeElementosEmpilhados;
    }


    /**
     * Desempilha VÁRIOS elementos na pilha de acordo com a quantidade recebida.
     *
     * @param qntDeElementosDesempilhados quantidade de elementos que deverá ser desempilhados.
     * @return Quantidade atual de elementos na pilha.
     */
    @Override
    public int desempilharVarios(int qntDeElementosDesempilhados) {
        int quantidadeElementos = 0;
        int contador = 0;
        No auxiliar = topo;

        if (qntDeElementosDesempilhados > 0){
            System.out.println("Desempilhando " + qntDeElementosDesempilhados + " elemento(s) da pilha.");
            while (auxiliar != null){
                if (contador < qntDeElementosDesempilhados){
                    System.out.println("Elemento " + topo.getConteudo() + " desempilhado.");
                    topo = topo.getProx();
                    auxiliar = auxiliar.getProx();
                    contador++;
                } else {
                    auxiliar = auxiliar.getProx();
                    contador++;
                }
            }
        } else {
            System.out.println("Número inválido!");
        }

        auxiliar = topo;
        while (auxiliar != null){
            quantidadeElementos++;
            auxiliar = auxiliar.getProx();
        }

        System.out.println("A pilha possui "+ quantidadeElementos + " elementos agora.");
        return quantidadeElementos;
    }
}
