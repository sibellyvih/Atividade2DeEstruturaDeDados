public class PilhaDinamica implements PilhaOperacoes{
    No topo;

    public PilhaDinamica() {
        this.topo = null;
        System.out.println("Pilha dinâmica criada!");
    }

    public int tamanho(){
        int quantidadeElementos = 0;
        No auxiliar = topo;

        while (auxiliar != null){
            quantidadeElementos++;
            auxiliar = auxiliar.getProx();
        }
        return quantidadeElementos;
    }

    @Override
    public int empilhar(String elementoInserido) {
        No novoTopo = new No(elementoInserido);

        novoTopo.setProx(topo);
        topo = novoTopo;
        System.out.println("Elemento " + elementoInserido + " empilhado com sucesso!");

        System.out.println("A pilha possui "+ tamanho() + " elementos.");
        return tamanho();
    }


    @Override
    public int desempilhar() {

        if (topo == null) {
            System.out.println("Pilha vazia!");
            return 0;
        } else {
            System.out.println("Desempilhando o elemento " + topo.getConteudo() + " do topo da pilha.");
            topo = topo.getProx();
        }

        System.out.println("A pilha possui "+ tamanho()+ " elementos agora.");
        return tamanho();
    }

    @Override
    public void exibir() {
        No auxiliar = topo;

        if (topo != null){
            System.out.println("\nExibindo pilha dinâmica: ");
           while (auxiliar != null){
               System.out.println("         " + auxiliar.getConteudo());
               auxiliar = auxiliar.getProx();
           }
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    @Override
    public int empilharVarios(String[] elementos) {
        int quantidadeElementosEmpilhados = 0;

        for (int i = 0; i < elementos.length; i++){
            No novoNo = new No(elementos[i]);
            novoNo.setProx(topo);
            topo = novoNo;
            quantidadeElementosEmpilhados++;
            System.out.println("Elemento " + elementos[i] + " adicionado com sucesso!");
        }

        System.out.println("Total de elementos adicionados: " + quantidadeElementosEmpilhados);
        return quantidadeElementosEmpilhados;
    }

    @Override
    public int desempilharVarios(int qntDeElementosDesempilhados) {
        int contador = 0;

        if (topo == null){
            System.out.println("Pilha vazia!");
            return 0;
        }
        if (qntDeElementosDesempilhados > 0 && qntDeElementosDesempilhados <= tamanho()){
            while (topo != null && contador < qntDeElementosDesempilhados){
                System.out.println("Elemento " + topo.getConteudo() + " desempilhado.");
                topo = topo.getProx();
                contador++;
                }
        } else {
            System.out.println("Quantidade inválido!");
        }


        System.out.println("A pilha possui "+ tamanho() + " elementos agora.");
        return tamanho();
    }
}
