/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func;

/**
 *	
    Armazenar objetos em variáveis compostas homogêneas não difere muito de armazenar primitivos em variáveis compostas homogêneas. 

   Por conta disto iremos trabalhar com os seguintes problemas:

   1.	Escreva uma classe “Funcionário” com os atributos matricula (int), nome (String), departamento (int), salário (float) e função (String). Adicione na classe um construtor que receba todos os parâmetros para inicializar os dados de um funcionário.

   2.	Escreva uma classe “SetorPessoal” que tenha como atributo um vetor da classe “Funcionário” e uma variável inteira para ser usada como índice do vetor. Crie um construtor que receba como parâmetro o número de funcionários de uma empresa para instanciar o vetor e inicialize o índice do vetor com zero. Acrescente os seguintes métodos a classe:

   a.	um método para adicionar funcionários no vetor definido na classe;
   b.	um método que possa imprimir a folha de pagamento informando o nome dos funcionários e o seus respectivos salários. 
   c.	um método que possa retornar o valor total da folha de pagamento.
   d.	um método que possa retornar o nome do funcionário que recebe o maior salário.
   e.	um método que possa receber como parâmetro o número de um determinado departamento e mostrar o nome e o cargo de todos os funcionários daquele departamento.
   f.	um método que possa receber como parâmetro o nome de uma determinada função e posteriormente imprimir o nome de todas as pessoas que exercem essa função.

 * 
 * 
 * @author Vinicius -239547
 */
public class TesteFunc {
    public static void main (String [] args)
    {
        Funcionarios f1 = new Funcionarios (23567,"João pessoal",20,2500,"Analista de Sistemas");
        Funcionarios f2 = new Funcionarios (27567,"Priscila soares",10,1500,"Marketing");
        Funcionarios f3 = new Funcionarios (26567,"Neves de almeida",30,2300,"Auxiliar de Produção");
        Funcionarios f4 = new Funcionarios (25567,"João Augusto",20,2800,"Analista de Sistemas");
        Funcionarios f5 = new Funcionarios (24567,"Lindomar Ferreira",20,3000,"Analista de Sistemas");    

        SetorPessoal setor= new SetorPessoal(6);

        setor.adicionar(f1);
        setor.adicionar(f2);
        setor.adicionar(f3);
        setor.adicionar(f4);
        setor.adicionar(f5);

        setor.imprimirFolha();
        System.out.println("o total da folha de pagamento é: " + setor.totalFolha());
        System.out.println("quem recebe o maior salario é o funcionario: " + setor.maiorSal());
        setor.mostrarDept(10);
        setor.mostrarFunc("analista de sistemas");
    
    }
}
