package nodes;

public class No {
    int valor;
    No noEsquerda;
    No noDireita;
    public static No raiz;

    public No(int valor) {
        this.valor = valor;
    }

    public No() {
        this.raiz = null;
    }

    public static void inserir(int valor) {
        inserir(raiz, valor);
    }

    public static void inserir (No node, int valor) {
        if (node == null) {
            raiz = new No(valor);
        } else {
            if (valor < node.valor) {
                if (node.noEsquerda != null) {
                    inserir(node.noEsquerda, valor);
                } else {
                    System.out.println("Inserindo " +valor+ " a esquerda de " + node.valor);
                    node.noEsquerda = new No(valor);
                }
            } else {
                if ( node.noDireita != null ) {
                    inserir(node.noDireita, valor);
                } else {
                    System.out.println("Inserindo " +valor+ " a direita de " + node.valor);
                    node.noDireita = new No(valor);
                }
            }
        }
    }

    public static void main(String[] args) {
        No node = new No();
//            inserir(30);
//            inserir(20);
//            inserir(10);
//            inserir(50);
        node.inserir(10);
        node.inserir(20);
        node.inserir(30);
        node.inserir(5);
        node.inserir(25);

    }
}
