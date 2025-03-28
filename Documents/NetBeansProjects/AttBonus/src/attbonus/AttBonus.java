package attbonus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AttBonus {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList();
        Scanner ler = new Scanner(System.in);

        int op = 9;
        while (op != 0) {
            System.out.println("menu\n"
                    + "1 - Adicionar Números\n"
                    + "2 - Listar Números\n"
                    + "3 - Listar Número pares\n"
                    + "4 - Listar Número ímpares\n"
                    + "5 - Atualizar Números\n"
                    + "6 - Excluir Números\n"
                    + "7 - Buscar Número\n"
                    + "8 - Exibir média os Números\n"
                    + "9 - Exibir Número máximo e mínimo\n"
                    + "10 - Limpar a Lista De Números\n"
                    + "11 - Ordernar Lista De Números\n"
                    + "0 - Sair");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o Número:");
                    listaNumeros.add(ler.nextInt());
                    System.out.println("Número salvo com sucesso ;)");
                    break;

                case 2:
                    if (!listaNumeros.isEmpty()) {
                        System.out.println("Lista De Compras");
                        for (int i = 0; i < listaNumeros.size(); i++) {
                            System.out.println(" - " + listaNumeros.get(i) + "\n");
                        }
                    } else {
                        System.out.println("A Lista De Numeros esta vazia");
                    }

                    break;

                case 3:
                    int i = 0;
                    if (!listaNumeros.isEmpty()) {
                        System.out.println("Lista De Números (pares)");
                        for (i = 0; i < listaNumeros.size(); i++) {
                            if (listaNumeros.get(i) % 2 == 0) {
                                System.out.println(" - " + listaNumeros.get(i) + "\n");
                            }
                        }
                    } else {
                        System.out.println("A Lista De Números esta vazia");
                    }
                    break;

                case 4:
                    if (!listaNumeros.isEmpty()) {
                        System.out.println("Lista De Números (ímpares)");
                        for (i = 0; i < listaNumeros.size(); i++) {
                            if (listaNumeros.get(i) % 2 != 0) {
                                System.out.println(" - " + listaNumeros.get(i) + "\n");
                            }
                        }
                    } else {
                        System.out.println("A Lista De Números esta vazia");
                    }
                    break;

                case 5:
                    System.out.print("Digite o número que deseja alterar: ");
                    int numeroAntigo = ler.nextInt();

                    if (listaNumeros.contains(numeroAntigo)) {
                        System.out.print("Digite o novo número: ");
                        int novoNumero = ler.nextInt();
                        int indice = listaNumeros.indexOf(numeroAntigo);
                        listaNumeros.set(indice, novoNumero);
                        System.out.println("Número alterado com sucesso: ");
                    } else {
                        System.out.println("Número não encontrado na lista!");
                    }
                    break;

                case 6:
                    System.out.print("Digite o número que deseja excluir: ");
                    int numeroExcluir = ler.nextInt();
                    if (listaNumeros.contains(numeroExcluir)) {
                        listaNumeros.remove(Integer.valueOf(numeroExcluir));
                        System.out.println("Número excluído com sucesso: ");
                    } else {
                        System.out.println("Número não encontrado na lista!");
                    }
                    break;

                case 7:
                    System.out.print("Digite o número que deseja pesquisar: ");
                    int numeroBuscar = ler.nextInt();
                    if (listaNumeros.contains(numeroBuscar)) {
                        System.out.println("Número '" + numeroBuscar + "' encontrado!");
                    } else {
                        System.out.println("Número '" + numeroBuscar + "' inexistente na lista!");
                    }
                    break;

                case 8:
                    if (!listaNumeros.isEmpty()) {
                        int soma = 0;
                        for (int num : listaNumeros) {
                            soma += num;
                        }
                        double media = soma / (double) listaNumeros.size();
                        System.out.println("A média dos números é: " + media);
                    } else {
                        System.out.println("A lista está vazia, não é possível calcular a média!");
                    }
                    break;

                case 9:
                    if (!listaNumeros.isEmpty()) {
                        int maiorNumero = Collections.max(listaNumeros);
                        int menorNumero = Collections.min(listaNumeros);

                        System.out.println("O Número Máximo da lista: " + maiorNumero);
                        System.out.println("O Número Minimo da lista: " + menorNumero);
                    } else {
                        System.out.println("A lista está vazia, não é possível encontrar o maior e o menor número.");
                    }
                    break;

                case 10:
                    if (!listaNumeros.isEmpty()) {
                        int sn;
                        System.out.println("Tem certeza? 1-sim 2-não");
                        sn = ler.nextInt();
                        if (sn == 1) {
                            listaNumeros.clear();

                        } else {
                            System.out.println("Limpeza Cancelada!!");
                        }
                    } else {
                        System.out.println("Lista já se encontra vazia");
                    }
                    break;

                case 11:
                    if (!listaNumeros.isEmpty()) {
                        int ordem;
                        System.out.println("Digite:\n"
                                + "1 - Crescente\n"
                                + "2 - Decrescente\n");
                        ordem = ler.nextInt();
                        if (ordem == 1) {
                            Collections.sort(listaNumeros);
                            System.out.println("Lista de Números(crescente):" + listaNumeros);
                        } else if (ordem == 2) {
                            Collections.sort(listaNumeros, Collections.reverseOrder());
                            System.out.println("Lista de Números(decrescente):" + listaNumeros);

                        } else {
                            System.out.println("digite apenas 1 ou 2!!");
                        }
                    } else {
                        System.out.println("A Lista está vazia!");
                    }
                    break;

                default:
                    if (op == 0) {
                        System.out.println("Bye Bye");
                    } else {
                        System.out.println("Opção Invalida");
                    }
            }

        }
    }
}
