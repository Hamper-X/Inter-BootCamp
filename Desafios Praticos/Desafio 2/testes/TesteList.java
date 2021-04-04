package testes;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TesteList {
    public static void main(String[] args) {
        /*
            Lista<tipo> nome = new ArrayList<>();
            nomes.add(tipo);
            nome.set(posição, novo nome); //seta o novo nome na posição 2 
            nome.remove(indece ou elemento)
            nome.get(indece)
            bool x = nome.contains(elemento) //pesquisa
            int index =  nome.indexOf(elemento)
            
            for(tipo variavel: nomeArray){
                print(variavel)
            }

            Iterator<tipo> iterator = nome.iterator()
            while(iterator.hasNext()){//Roda enquanto houver proximo elemento
                print(iterator.next())//printa o atual
            }     

        */

        /*
         * Collections III - Sets
                hashSet: Usa quando quer eficiencia e ordem nao importa
                    Set<tipo> nome = new HashSet<>();
                    nome.add(tipo)
                    Iterator<tipo> iterator = nome.iterator()

                LinkedHashSet: Usa quando quer manter a ordem de inserção(mais lento de todos)

                LinkedHashSet<tipo> nome = new HashSet<>();
                    nome.add(tipo)
                    Iterator<tipo> iterator = nome.iterator()
                

                TreeSet: Quando é necessario alterar a ordem atraves do uso de comparators. Rapido pra leitura, lento pra modificação

                TreeSet<tipo> nome = new TreeSet<>();
                    nome.add(tipo)
                    Iterator<tipo> iterator = nome.iterator()
                    nome.first() //pega a raiz

        */

        /*
            MAP:
                Map<tipoChave,tipo> nome = new HashMap<>();
                nome.put(chave,)

                nome.get("chave")
                nome.containsKey("chave")
                nome.containsValue("valor")
        */
    }
}