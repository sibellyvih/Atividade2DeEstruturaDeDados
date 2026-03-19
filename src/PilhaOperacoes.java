public interface PilhaOperacoes {

    /**
     * Empilha UM elemento na pilha.
     *
     * @param elementoInserido Elemento que deverá ser inserido.
     * @return Quantidade atual total de elementos da pilha.
     */
    public int empilhar(String elementoInserido);

    /**
     * Desempilha UM elemento da pilha.
     *
     * @return Quantidade atual total de elementos da pilha.
     */
    public int desempilhar();

    /**
     * Exibe os elementos em forma de pilha.
     *
     */
    public void exibir();

    /**
     * Empilha VÁRIOS elementos na pilha recebidos de um vetor.
     * Para a pilha estática, se encher a pilha adiocionar apenas o que for possível.
     *
     * @param elementos Elemento que deverá ser empilhados.
     * @return Quantidade de elementos inseridos.
     */
    public int empilharVarios(String[] elementos);

    /**
     * Desempilha VÁRIOS elementos na pilha de acordo com a quantidade recebida.
     *
     * @param qntDeElementosDesempilhados quantidade de elementos que deverá ser desempilhados.
     * @return Quantidade atual de elementos na pilha.
     */
    public int desempilharVarios(int qntDeElementosDesempilhados);
}