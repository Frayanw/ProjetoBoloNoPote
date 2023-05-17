import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int menu, qtdeOvo, qtdeMoran, qtdePote;
        float valorChocolate, gramaChocolate, chocolateValor, valorLitroLeite, qtdeAcu, valorAcu, qtdeMarg, valorMarg, qtdeFarTg, valorFarTg, valorOvo, qtdeLeitCond, valorLeitCond;
        float morangoConta, qtdeCreLeit, valorCreLeit, qtdeLeitNinho, valorLeitNinho, valorMoran, qtdeChoco, valorChoco, mlLeite, leiteValor;
        float leiteCondensadoMulti, leiteCondensadoTotal, leiteCondensadoGrama, qtdeMaracuja, valorMaracuja, qtdeAmido, valorAmido, qtdeAgua, valorAgua, qtdeLeite, valorLeite;
        float margarinaValorRecheio, qtdeMantei, leiteNinhoTotal, leiteNinhoMulti, leiteNinhoGrama, valorMantei, valorPote, aguaValor, valorLitroAgua, mlAgua, acucarValorRecheio;
        float receitaMaracuja, massaTotal, receita2Amores, receitaMorango, cremeDeLeiteTotal, cremeDeLeiteMulti, cremeDeLeiteGrama, potesValor, sucoMaracujaValor, mlMaracuja, valorSucoMaracuja, valorAmi, amidoValor, gramaAmido, ovoGemas;
        float acucarValor, gramaAcucar, valorAcucar, ovoConta, gramaMargarina, margarinaMulti, margarinaTotal, farinhaTotal, farinhaGr, valorFarinha;
        float valorVenda, valorUnidade, lucro, lucroporc;

        System.out.println("Menu");
        System.out.println("Selecione o numero da opcao desejada:");
        System.out.println("1 - Calcular receitas possives infomando os ingredientes.");
        System.out.println("2 - Calcular receita para Leite ninho com morangos.");
        System.out.println("3 - Calcular receita para Dois amores.");
        System.out.println("4 - Calcular receita para Maracuja.");
        System.out.println("5 - Sair");
        menu = teclado.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Primeiro informe os igredientes para a massa.");
                System.out.println("Informe a quantidade de acucar em Kg: ");
                qtdeAcu = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAcu = teclado.nextFloat();
                System.out.println("Informe a quantidade de margarina em Kg: ");
                qtdeMarg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorMarg = teclado.nextFloat();
                System.out.println("Informe a quantidade de farinha de trigo em Kg: ");
                qtdeFarTg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorFarTg = teclado.nextFloat();
                System.out.println("Informe a quantidade de ovos: ");
                qtdeOvo = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade de ovo: ");
                valorOvo = teclado.nextFloat();
                System.out.println("Agora informe os ingredientes do recheio e cobertura.");
                System.out.println("Para o recheio Leite ninho com morangos");
                System.out.println("Informe a quantidade de Leite condensado em Kg: ");
                qtdeLeitCond = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorLeitCond = teclado.nextFloat();
                System.out.println("Informe a quantidade de Creme de leite em Kg: ");
                qtdeCreLeit = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorCreLeit = teclado.nextFloat();
                System.out.println("Informe a quantidade de Leite ninho em Kg: ");
                qtdeLeitNinho = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorLeitNinho = teclado.nextFloat();
                System.out.println("Informe a quantidade de morangos: ");
                qtdeMoran = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade: ");
                valorMoran = teclado.nextFloat();
                System.out.println("Para o recheio Dois amores");
                System.out.println("Informe a quantidade de Chocolate em po em Kg: ");
                qtdeChoco = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorChoco = teclado.nextFloat();
                System.out.println("Para o recheio Maracuja");
                System.out.println("Informe a quantidade de suco de maracuja em litros: ");
                qtdeMaracuja = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorMaracuja = teclado.nextFloat();
                System.out.println("Informe a quantidade de Amido de milho em Kg: ");
                qtdeAmido = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAmi = teclado.nextFloat();
                System.out.println("Informe a quantidade de Agua em litros: ");
                qtdeAgua = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorLitroAgua = teclado.nextFloat();
                System.out.println("Informe a quantidade de Leite em litros: ");
                qtdeLeite = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorLitroLeite = teclado.nextFloat();
                System.out.println("Por fim informe a quantidade de potes: ");
                qtdePote = teclado.nextInt();
                System.out.println("Informe o valor pago pela unidade: ");
                valorPote = teclado.nextFloat();

                //Calculos
                //Massa do Bolo
                //Acucar
                gramaAcucar = qtdeAcu * 1000; // convertendo kg p/ grama
                valorAcucar = qtdeAcu * valorAcu; // valor pago no açucar TOTAL
                acucarValor = (valorAcucar * 300) / gramaAcucar;//valor 300 gramas
                //Ovos
                ovoConta = valorOvo * 4;//Valor 4 ovos
                //Margarina
                margarinaMulti = qtdeMarg * 1000;//Valor de kg / gramas
                margarinaTotal = qtdeMarg * valorMarg;//Valor total pago na margarina
                gramaMargarina = (300 * margarinaTotal) / margarinaMulti;//Valor 300 gramas de margarina
                //Farinha
                farinhaTotal = qtdeFarTg * valorFarTg;//Valor total pago na farinha
                farinhaGr = qtdeFarTg * 1000;//Valor de kg/gramas
                valorFarinha = (300 * farinhaTotal) / farinhaGr;//Valor 300 gramas de Farinha
                //Valor da Massa total
                massaTotal = acucarValor + ovoConta + gramaMargarina + valorFarinha;
                // Potes de 220 ml
                potesValor = valorPote * 15;//Valor 15 potes
                //Recheio de Maracujá 
                //Suco de Maracujá
                mlMaracuja = qtdeMaracuja * 1000; // convertendo Litros p/ ML
                valorSucoMaracuja = qtdeMaracuja * valorMaracuja; // valor pago no suco de maracujá TOTAL
                sucoMaracujaValor = (valorSucoMaracuja * 480) / mlMaracuja;//valor 480 mls de suco de maracujá 
                //Amido de milho
                gramaAmido = qtdeAmido * 1000; // convertendo kg p/ grama
                valorAmido = qtdeAmido * valorAmi; // valor pago no amido de milho TOTAL
                amidoValor = (valorAmido * 20) / gramaAmido;//valor 20 gramas
                //gemas
                ovoGemas = valorOvo * 6;//Valor 6 gemas
                //Água
                mlAgua = qtdeAgua * 1000; // convertendo Litros p/ ML
                valorAgua = qtdeAgua * valorLitroAgua; // valor pago na água TOTAL
                aguaValor = (valorAgua * 250) / mlAgua;//valor de 250 mls de água
                // Açucar
                acucarValorRecheio = (valorAcucar * 200) / gramaAcucar;//valor 200 gramas de açucar
                //Leite
                mlLeite = qtdeLeite * 1000; // convertendo Litros p/ ML
                valorLeite = qtdeLeite * valorLitroLeite; // valor pago no leite TOTAL
                leiteValor = (valorLeite * 200) / mlLeite;//valor de 200 mls de leite
                //Margarina
                margarinaValorRecheio = (margarinaTotal * 50) / margarinaMulti;//valor 50 gramas de manteiga
                //recheio Leite ninho com morango
                //leite Condensado
                leiteCondensadoMulti = qtdeLeitCond * 1000; // convertendo kg p/ grama
                leiteCondensadoTotal = qtdeLeitCond * valorLeitCond; // valor pago no leite condensado TOTAL
                leiteCondensadoGrama = (600 * leiteCondensadoTotal) / leiteCondensadoMulti; //valor 600 gramas de leite condensado
                //creme de Leite
                cremeDeLeiteMulti = qtdeCreLeit * 1000; // convertendo kg p/ grama
                cremeDeLeiteTotal = qtdeCreLeit * valorCreLeit; // valor pago no leite condensado TOTAL
                cremeDeLeiteGrama = (600 * cremeDeLeiteTotal) / cremeDeLeiteMulti; //valor 600 gramas creme de leite
                //leite Ninho
                leiteNinhoMulti = qtdeLeitNinho * 1000; // convertendo kg p/ grama
                leiteNinhoTotal = qtdeLeitNinho * valorLeitNinho; // valor pago no leite ninho TOTAL
                leiteNinhoGrama = (30 * leiteNinhoTotal) / leiteNinhoMulti; //valor 30 gramas leite ninho
                //morangos
                morangoConta = valorMoran * 20;//Valor 20 morangos
                //recheio Dois amores
                //chocolate em pó
                gramaChocolate = qtdeChoco * 1000; // convertendo kg p/ grama
                valorChocolate = qtdeChoco * valorChoco; // valor pago no chocolate em pó TOTAL
                chocolateValor = (valorChocolate * 600) / gramaChocolate;//valor 600 gramas de chocolate em pó

                //Calculo dos valores totais
                // Valor bolo de maracujá TOTAL
                receitaMaracuja = massaTotal + potesValor + sucoMaracujaValor + amidoValor + ovoGemas + aguaValor + acucarValorRecheio + leiteValor + margarinaValorRecheio;
                //valor receita de leite ninho com morango TOTAL
                receitaMorango = massaTotal + potesValor + leiteCondensadoGrama + cremeDeLeiteGrama + leiteNinhoGrama + morangoConta;
                //valor receita dois amores TOTAL
                receita2Amores = massaTotal + potesValor + leiteCondensadoGrama + cremeDeLeiteGrama + chocolateValor;
                //lucro
                if (receitaMaracuja > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de Maracuja: %.2f\n", receitaMaracuja);
                } else {
                    System.out.printf("Custo de fabricacao da receita de Maracuja: %.2f\n", receitaMaracuja);
                    System.out.println("Informe o valor da unidade do bolo de maracuja: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receitaMaracuja;//lucro em reais
                    lucroporc = (lucro / receitaMaracuja) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f%%\n", lucro, lucroporc);
                }
                if (receitaMorango > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de Morango: %.2f\n", receitaMorango);
                } else {
                    System.out.printf("Custo de fabricacao da receita de Morango: %.2f\n", receitaMorango);
                    System.out.println("Informe o valor da unidade do bolo de leite ninho com morango: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receitaMorango;//lucro em reais
                    lucroporc = (lucro / receitaMorango) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f%%\n", lucro, lucroporc);
                }
                if (receita2Amores > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de 2 Amores: %.2f\n", receita2Amores);
                } else {
                    System.out.printf("Custo de fabricacao da receita de 2 Amores: %.2f\n", receita2Amores);
                    System.out.println("Informe o valor da unidade do bolo de 2 amores: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receita2Amores;//lucro em reais
                    lucroporc = (lucro / receita2Amores) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f%%\n", lucro, lucroporc);
                }

                break;

            case 2:
                System.out.println("Primeiro informe os igredientes para a massa.");
                System.out.println("Informe a quantidade de acucar em Kg: ");
                qtdeAcu = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAcu = teclado.nextFloat();
                System.out.println("Informe a quantidade de margarina em Kg: ");
                qtdeMarg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorMarg = teclado.nextFloat();
                System.out.println("Informe a quantidade de farinha de trigo em Kg: ");
                qtdeFarTg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorFarTg = teclado.nextFloat();
                System.out.println("Informe a quantidade de ovos: ");
                qtdeOvo = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade de ovo: ");
                valorOvo = teclado.nextFloat();
                System.out.println("Para o recheio Leite ninho com morangos");
                System.out.println("Informe a quantidade de Leite condensado em Kg: ");
                qtdeLeitCond = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorLeitCond = teclado.nextFloat();
                System.out.println("Informe a quantidade de Creme de leite em Kg: ");
                qtdeCreLeit = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorCreLeit = teclado.nextFloat();
                System.out.println("Informe a quantidade de Leite ninho em Kg: ");
                qtdeLeitNinho = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorLeitNinho = teclado.nextFloat();
                System.out.println("Informe a quantidade de morangos: ");
                qtdeMoran = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade: ");
                valorMoran = teclado.nextFloat();
                System.out.println("Por fim informe a quantidade de potes: ");
                qtdePote = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade: ");
                valorPote = teclado.nextFloat();

                //Calculos
                //Massa do Bolo
                //Acucar
                gramaAcucar = qtdeAcu * 1000; // convertendo kg p/ grama
                valorAcucar = qtdeAcu * valorAcu; // valor pago no açucar TOTAL
                acucarValor = (valorAcucar * 300) / gramaAcucar;//valor 300 gramas
                //Ovos
                ovoConta = valorOvo * 4;//Valor 4 ovos
                //Margarina
                margarinaMulti = qtdeMarg * 1000;//Valor de kg / gramas
                margarinaTotal = qtdeMarg * valorMarg;//Valor total pago na margarina
                gramaMargarina = (300 * margarinaTotal) / margarinaMulti;//Valor 300 gramas de margarina
                //Farinha
                farinhaTotal = qtdeFarTg * valorFarTg;//Valor total pago na farinha
                farinhaGr = qtdeFarTg * 1000;//Valor de kg/gramas
                valorFarinha = (300 * farinhaTotal) / farinhaGr;//Valor 300 gramas de Farinha
                //Valor da Massa total
                massaTotal = acucarValor + ovoConta + gramaMargarina + valorFarinha;
                // Potes de 220 ml
                potesValor = valorPote * 15;//Valor 15 potes

                //recheio Leite ninho com morango
                //leite Condensado
                leiteCondensadoMulti = qtdeLeitCond * 1000; // convertendo kg p/ grama
                leiteCondensadoTotal = qtdeLeitCond * valorLeitCond; // valor pago no leite condensado TOTAL
                leiteCondensadoGrama = (600 * leiteCondensadoTotal) / leiteCondensadoMulti; //valor 600 gramas de leite condensado
                //creme de Leite
                cremeDeLeiteMulti = qtdeCreLeit * 1000; // convertendo kg p/ grama
                cremeDeLeiteTotal = qtdeCreLeit * valorCreLeit; // valor pago no leite condensado TOTAL
                cremeDeLeiteGrama = (600 * cremeDeLeiteTotal) / cremeDeLeiteMulti; //valor 600 gramas creme de leite
                //leite Ninho
                leiteNinhoMulti = qtdeLeitNinho * 1000; // convertendo kg p/ grama
                leiteNinhoTotal = qtdeLeitNinho * valorLeitNinho; // valor pago no leite ninho TOTAL
                leiteNinhoGrama = (30 * leiteNinhoTotal) / leiteNinhoMulti; //valor 30 gramas leite ninho
                //morangos
                morangoConta = valorMoran * 20;//Valor 20 morangos

                //Calculo dos valores totais
                //valor receita de leite ninho com morango TOTAL
                receitaMorango = massaTotal + potesValor + leiteCondensadoGrama + cremeDeLeiteGrama + leiteNinhoGrama + morangoConta;
                //lucro
                if (receitaMorango > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de Morango: %.2f\n", receitaMorango);
                } else {
                    System.out.printf("Custo de fabricacao da receita de Morango: %.2f\n", receitaMorango);
                    System.out.println("Informe o valor da unidade do bolo de leite ninho com morango: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receitaMorango;//lucro em reais
                    lucroporc = (lucro / receitaMorango) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f\n", lucro, lucroporc);
                }

                break;
            case 3:
                System.out.println("Primeiro informe os igredientes para a massa.");
                System.out.println("Informe a quantidade de acucar em Kg: ");
                qtdeAcu = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAcu = teclado.nextFloat();
                System.out.println("Informe a quantidade de margarina em Kg: ");
                qtdeMarg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorMarg = teclado.nextFloat();
                System.out.println("Informe a quantidade de farinha de trigo em Kg: ");
                qtdeFarTg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorFarTg = teclado.nextFloat();
                System.out.println("Informe a quantidade de ovos: ");
                qtdeOvo = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade de ovo: ");
                valorOvo = teclado.nextFloat();
                System.out.println("Para o recheio Dois amores");
                System.out.println("Informe a quantidade de Leite condensado em Kg: ");
                qtdeLeitCond = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorLeitCond = teclado.nextFloat();
                System.out.println("Informe a quantidade de Creme de leite em Kg: ");
                qtdeCreLeit = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorCreLeit = teclado.nextFloat();
                System.out.println("Informe a quantidade de Chocolate em po em Kg: ");
                qtdeChoco = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorChoco = teclado.nextFloat();
                System.out.println("Por fim informe a quantidade de potes: ");
                qtdePote = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade: ");
                valorPote = teclado.nextFloat();

                //Calculos
                //Massa do Bolo
                //Acucar
                gramaAcucar = qtdeAcu * 1000; // convertendo kg p/ grama
                valorAcucar = qtdeAcu * valorAcu; // valor pago no açucar TOTAL
                acucarValor = (valorAcucar * 300) / gramaAcucar;//valor 300 gramas
                //Ovos
                ovoConta = valorOvo * 4;//Valor 4 ovos
                //Margarina
                margarinaMulti = qtdeMarg * 1000;//Valor de kg / gramas
                margarinaTotal = qtdeMarg * valorMarg;//Valor total pago na margarina
                gramaMargarina = (300 * margarinaTotal) / margarinaMulti;//Valor 300 gramas de margarina
                //Farinha
                farinhaTotal = qtdeFarTg * valorFarTg;//Valor total pago na farinha
                farinhaGr = qtdeFarTg * 1000;//Valor de kg/gramas
                valorFarinha = (300 * farinhaTotal) / farinhaGr;//Valor 300 gramas de Farinha
                //Valor da Massa total
                massaTotal = acucarValor + ovoConta + gramaMargarina + valorFarinha;
                // Potes de 220 ml
                potesValor = valorPote * 15;//Valor 15 potes

                //recheio Dois amores
                //leite Condensado
                leiteCondensadoMulti = qtdeLeitCond * 1000; // convertendo kg p/ grama
                leiteCondensadoTotal = qtdeLeitCond * valorLeitCond; // valor pago no leite condensado TOTAL
                leiteCondensadoGrama = (600 * leiteCondensadoTotal) / leiteCondensadoMulti; //valor 600 gramas de leite condensado
                //creme de Leite
                cremeDeLeiteMulti = qtdeCreLeit * 1000; // convertendo kg p/ grama
                cremeDeLeiteTotal = qtdeCreLeit * valorCreLeit; // valor pago no leite condensado TOTAL
                cremeDeLeiteGrama = (600 * cremeDeLeiteTotal) / cremeDeLeiteMulti; //valor 600 gramas creme de leite
                //chocolate em pó
                gramaChocolate = qtdeChoco * 1000; // convertendo kg p/ grama
                valorChocolate = qtdeChoco * valorChoco; // valor pago no chocolate em pó TOTAL
                chocolateValor = (valorChocolate * 600) / gramaChocolate;//valor 600 gramas de chocolate em pó

                //Calculo dos valores totais
                //valor receita dois amores TOTAL
                receita2Amores = massaTotal + potesValor + leiteCondensadoGrama + cremeDeLeiteGrama + chocolateValor;
                //lucro
                if (receita2Amores > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de 2 Amores: %.2f\n", receita2Amores);
                } else {
                    System.out.printf("Custo de fabricacao da receita de 2 Amores: %.2f\n", receita2Amores);
                    System.out.println("Informe o valor da unidade do bolo de 2 amores: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receita2Amores;//lucro em reais
                    lucroporc = (lucro / receita2Amores) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f\n", lucro, lucroporc);
                }

                break;
            case 4:
                System.out.println("Primeiro informe os igredientes para a massa.");
                System.out.println("Informe a quantidade de acucar em Kg: ");
                qtdeAcu = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAcu = teclado.nextFloat();
                System.out.println("Informe a quantidade de margarina em Kg: ");
                qtdeMarg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorMarg = teclado.nextFloat();
                System.out.println("Informe a quantidade de farinha de trigo em Kg: ");
                qtdeFarTg = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorFarTg = teclado.nextFloat();
                System.out.println("Informe a quantidade de ovos: ");
                qtdeOvo = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade de ovo: ");
                valorOvo = teclado.nextFloat();
                System.out.println("Para o recheio Maracuja");
                System.out.println("Informe a quantidade de suco de maracuja em litros: ");
                qtdeMaracuja = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorMaracuja = teclado.nextFloat();
                System.out.println("Informe a quantidade de Amido de milho em Kg: ");
                qtdeAmido = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo Kg: ");
                valorAmi = teclado.nextFloat();
                System.out.println("Informe a quantidade de Agua em litros: ");
                qtdeAgua = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorLitroAgua = teclado.nextFloat();
                System.out.println("Informe a quantidade de Leite em litros: ");
                qtdeLeite = teclado.nextFloat();
                System.out.println("Informe o valor pago pelo litro: ");
                valorLitroLeite = teclado.nextFloat();
                System.out.println("Por fim informe a quantidade de potes: ");
                qtdePote = teclado.nextInt();
                System.out.println("Informe o valor pago por unidade: ");
                valorPote = teclado.nextFloat();

                //Calculos
                //Massa do Bolo
                //Acucar
                gramaAcucar = qtdeAcu * 1000; // convertendo kg p/ grama
                valorAcucar = qtdeAcu * valorAcu; // valor pago no açucar TOTAL
                acucarValor = (valorAcucar * 300) / gramaAcucar;//valor 300 gramas
                //Ovos
                ovoConta = valorOvo * 4;//Valor 4 ovos
                //Margarina
                margarinaMulti = qtdeMarg * 1000;//Valor de kg / gramas
                margarinaTotal = qtdeMarg * valorMarg;//Valor total pago na margarina
                gramaMargarina = (300 * margarinaTotal) / margarinaMulti;//Valor 300 gramas de margarina
                //Farinha
                farinhaTotal = qtdeFarTg * valorFarTg;//Valor total pago na farinha
                farinhaGr = qtdeFarTg * 1000;//Valor de kg/gramas
                valorFarinha = (300 * farinhaTotal) / farinhaGr;//Valor 300 gramas de Farinha
                //Valor da Massa total
                massaTotal = acucarValor + ovoConta + gramaMargarina + valorFarinha;
                // Potes de 220 ml
                potesValor = valorPote * 15;//Valor 15 potes
                //Recheio de Maracujá 
                //Suco de Maracujá
                mlMaracuja = qtdeMaracuja * 1000; // convertendo Litros p/ ML
                valorSucoMaracuja = qtdeMaracuja * valorMaracuja; // valor pago no suco de maracujá TOTAL
                sucoMaracujaValor = (valorSucoMaracuja * 480) / mlMaracuja;//valor 480 mls de suco de maracujá 
                //Amido de milho
                gramaAmido = qtdeAmido * 1000; // convertendo kg p/ grama
                valorAmido = qtdeAmido * valorAmi; // valor pago no amido de milho TOTAL
                amidoValor = (valorAmido * 20) / gramaAmido;//valor 20 gramas
                //gemas
                ovoGemas = valorOvo * 6;//Valor 6 gemas
                //Água
                mlAgua = qtdeAgua * 1000; // convertendo Litros p/ ML
                valorAgua = qtdeAgua * valorLitroAgua; // valor pago na água TOTAL
                aguaValor = (valorAgua * 250) / mlAgua;//valor de 250 mls de água
                // Açucar
                acucarValorRecheio = (valorAcucar * 200) / gramaAcucar;//valor 200 gramas de açucar
                //Leite
                mlLeite = qtdeLeite * 1000; // convertendo Litros p/ ML
                valorLeite = qtdeLeite * valorLitroLeite; // valor pago no leite TOTAL
                leiteValor = (valorLeite * 200) / mlLeite;//valor de 200 mls de leite
                //Margarina
                margarinaValorRecheio = (margarinaTotal * 50) / margarinaMulti;//valor 50 gramas de manteiga

                //Calculo dos valores totais
                // Valor bolo de maracujá TOTAL
                receitaMaracuja = massaTotal + potesValor + sucoMaracujaValor + amidoValor + ovoGemas + aguaValor + acucarValorRecheio + leiteValor + margarinaValorRecheio;
                //lucro
                if (receitaMaracuja > 60) {//se valor de compra passar 60 reais não tem lucro
                    System.out.println("Não teve lucro");
                    System.out.printf("Custo de fabricacao da receita de Maracuja: %.2f\n", receitaMaracuja);
                } else {
                    System.out.printf("Custo de fabricacao da receita de Maracuja: %.2f\n", receitaMaracuja);
                    System.out.println("Informe o valor da unidade do bolo de maracuja: ");
                    valorUnidade = teclado.nextFloat();
                    valorVenda = valorUnidade * 15;//valor de venda de 15 bolos
                    System.out.println("Valor total de 15 bolos vendendo: " + valorVenda);
                    lucro = valorVenda - receitaMaracuja;//lucro em reais
                    lucroporc = (lucro / receitaMaracuja) * 100; //lucro em porcentagem
                    System.out.printf("Valor do lucro em R$ %.2f\n Valor do lucro em porcentagem: %.2f%%\n", lucro, lucroporc);
                }

                break;
            case 5:
                break;
        }
    }
}