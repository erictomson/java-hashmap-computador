import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Criando o dicionario
        // HashMap exige um par de objetos
        HashMap<Integer, String> listaDePecas = new HashMap<>();

        // Adicionando peças à lista de peças
        // Chave e valor
        listaDePecas.put(1,"Placa de video");
        listaDePecas.put(2,"Processador");
        listaDePecas.put(3,"HDD");
        listaDePecas.put(4,"SSD");
        listaDePecas.put(5,"Fonte de energia");

        // Consultando por chave
        String value = listaDePecas.get(3);
        String value2 = listaDePecas.get(1);
        System.out.println(value);
        System.out.println(value2);

        // Imprimindo toda a lista
        imprimirLista(listaDePecas);

        // Removendo por chave
        listaDePecas.remove(5); // remove "Fonte de energia"
        listaDePecas.remove(4); // remove "SSD"

        // Imprimindo toda a lista atualizada
        System.out.println("lista atualizada");
        imprimirLista(listaDePecas);
    }

    private static void imprimirLista(HashMap<Integer, String> listaDePecas) {
        // Imprimir a lista percorrendo todos os valores
        // Necessitamos percorrer todas as chaves (keys)
        for(Integer chaveDePesquisa: listaDePecas.keySet()) {
            String valorDeOutput = listaDePecas.get(chaveDePesquisa);
            System.out.println(valorDeOutput);
        }
    }
}
