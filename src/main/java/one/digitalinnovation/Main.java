package one.digitalinnovation;

public class Main {

    public static void main(String[] args){

        ListaDuplamenteEncadeada<String> minhaListDEncadeada = new ListaDuplamenteEncadeada<>();
        minhaListDEncadeada.add("c1");
        minhaListDEncadeada.add("c2");
        minhaListDEncadeada.add("c3");
        minhaListDEncadeada.add("c4");
        minhaListDEncadeada.add("c5");
        minhaListDEncadeada.add("c6");
        minhaListDEncadeada.add("c7");

        System.out.println(minhaListDEncadeada);

        minhaListDEncadeada.remove(3);
        minhaListDEncadeada.add(3, "99");
        System.out.println(minhaListDEncadeada);
        System.out.println(minhaListDEncadeada.get(3));
    }
}
