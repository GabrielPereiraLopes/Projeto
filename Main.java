package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main{

  
    
    public static void main(String[] args) {
    
     
        
    ArrayList<Fabricante> Lista = new ArrayList<Fabricante>(); 
    ArrayList<Produtos> Lista1 = new ArrayList<Produtos>(); 
    Scanner sc = new Scanner(System.in);
    int escolha ;
    
    do{
        System.out.println("Digite a opcao desejada:"); 
        System.out.println("0 - Sair do programa ");
        System.out.println("1 -Cadastrar Fabricante");
        System.out.println("2 -Cadastrar Produto "); 
        System.out.println("3 -Listar Todos os Fabricantes");
        System.out.println("4 -Listar Todos os Produtos");
        System.out.println("5 -Listar os produtos de um determinado estado.");
        System.out.println("6 - Listar os produtos de uma determinada marca.");
        System.out.println("7 -Apresentar o(s) estado(s) onde esta registrado o produto mais caro.");
        System.out.println("8 - Apresentar o(s) fabricante(s) onde esta registrado o produto mais barato.");
        System.out.println("9 -Listar todos os produtos em ordem crescente de valor.");
        System.out.println("10 - Listar todos os produtos em ordem crescente de maior valor do lucro.");
        
        
        
        
        escolha = sc.nextInt();
        sc.nextLine();
        switch (escolha){ /// Cadastro de Fabricante

            case 1 -> {
            System.out.println("Digite o nome do fabricante:");
            String nome = sc.nextLine();
            System.out.println("Digite o site do fabricante:");
            String site = sc.nextLine();
            System.out.println("Digite o Telefone do fabricante:");
            String telefone = sc.nextLine();
            System.out.println("Digite a UF do fabricante:");
            String UF = sc.nextLine();
            Fabricante teste = new Fabricante(nome,site,telefone,UF);
            Lista.add(teste);

            System.out.println("Fabricante adcionado! ");
            break;
                }

            case 2 -> {   /// Cadastro de Produto
            System.out.println("Digite o nome do fabricante:");
            String nome = sc.nextLine();
            System.out.println("Digite o site do fabricante:");
            String site = sc.nextLine();
            System.out.println("Digite o Telefone do fabricante:");
            String telefone = sc.nextLine();
            System.out.println("Digite a UF do fabricante:");
            String UF = sc.nextLine();
            System.out.println("Digite a descricao do produto:");
            String descricao = sc.nextLine();
            System.out.println("Digite o peso do produto:");
            double peso = sc.nextDouble();
            System.out.println("Digite o valor de compra do produto:");
            double ValorCompra = sc.nextDouble();
            System.out.println("Digite o valor de venda produto:");
            double ValorVenda = sc.nextDouble();

            Produtos teste1 = new Produtos (nome,site,telefone,UF, descricao,peso,ValorCompra,ValorVenda);
            Lista1.add(teste1);


            System.out.println("Produto adcionado!");
            break;
            }


            case 3 -> {/// Listar fabricantes
                for (Fabricante i : Lista) {
                    System.out.println(i);  
                }
                break; 
            }
            
            case 4 -> {/// Listar produtos
                for (Produtos i : Lista1) {
                    System.out.println(i);
                    
                break;   
                }
            }
            
            case 5 -> {///Listar por estado
                System.out.println("Digite o estado desejado:");
                String estadoDesejado = sc.nextLine();
                System.out.println("Produtos no estado " + estadoDesejado + ":");
                for (Produtos i : Lista1) {
                    if (i.getUF().equalsIgnoreCase(estadoDesejado)) {
                        System.out.println(i);
                        System.out.println();
                    }
            }
            break; 
            }
        
            case 6->{///Listar por fabricante
                System.out.println("Digite o Fabricante desejado:");
                String fabricanteDesejado = sc.nextLine();
                System.out.println("Produtos do fabricante " + fabricanteDesejado + ":");
                for (Produtos i : Lista1) {
                    if (i.getNome().equalsIgnoreCase(fabricanteDesejado)) {
                        System.out.println(i);
                        System.out.println();
                
            }
            
            
                }
            }
            
            
            case 8->{/// Apresentar o(s) fabricante(s) onde esta registrado o produto mais barato
                double menorValorCompra = Lista1.get(0).getValorCompra();
                for (Produtos i : Lista1) {
                    double valorCompra = i.getValorCompra();
                    if (valorCompra < menorValorCompra) {
                        menorValorCompra = valorCompra;
                  }
                }
                ArrayList<Fabricante> fabricantesProdutoMaisBarato = new ArrayList<>();
                  for (Produtos i : Lista1) {
                    if (i.getValorCompra() == menorValorCompra) {
                        fabricantesProdutoMaisBarato.add(i);
                    }
                }

               
                System.out.println("Fabricantes(s) onde esta registrado o produto mais barato:");
                for (Fabricante fabricante : fabricantesProdutoMaisBarato) {
                    System.out.println(fabricante);
                    System.out.println(); // Pular linha
                }
                        }
            
            case 7->{///  listar por estados com produto mais caro 
                double MAIORValorCompra = Lista1.get(0).getValorCompra();
                for (Produtos i : Lista1) {
                    double valorCompra = i.getValorCompra();
                    if (valorCompra > MAIORValorCompra) {
                        MAIORValorCompra = valorCompra;
                  }
                }
                ArrayList<Fabricante> EstadosProdutoMaiscaro = new ArrayList<>();
                  for (Produtos i : Lista1) {
                    if (i.getValorCompra() == MAIORValorCompra) {
                        EstadosProdutoMaiscaro.add(i);
                    }
                }

                // Apresentar os fabricantes com produto mais caro
                System.out.println("Estados(s) onde esta registrado o produto mais caro:");
                for (Fabricante fabricante : EstadosProdutoMaiscaro) {
                    System.out.println(fabricante);
                    System.out.println(); // Pular linha
                }
                        }
            
            case 9 ->{//Listar todos os produtos em ordem crescente de valor.
                Collections.sort(Lista1, (p1, p2) -> Double.compare(p1.getValorCompra(), p2.getValorCompra()));

                // Apresentar os produtos em ordem crescente de valor
                System.out.println("Produtos em ordem crescente de valor:");
                for (Produtos produto : Lista1) {
                    System.out.println(produto);
                        System.out.println(); // Pular linha  
                }
            break;
                }
            
            
            case 10 ->{
                            // Apresentar os produtos em ordem crescente de maior valor do lucro
                 Collections.sort(Lista1, (p1, p2) -> Double.compare(p2.getValorLucro(), p1.getValorLucro()));            
                System.out.println("Produtos em ordem crescente de maior valor do lucro:");
                for (Produtos produto : Lista1) {
                    System.out.println(produto);
                    System.out.println(); // Pular linha
            }
            break;
            }
            
            
            
        }
      }while(escolha != 0);
    
     System.out.println("Programa finalizado!"); 
    }
}
    
     
