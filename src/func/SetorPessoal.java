/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func;

/**
 *
 * @author Vinicius - 239547
 */
public class SetorPessoal {
    Funcionarios [] func ;
    int indVetor = 0;
/**    Funcionarios f1 = new Funcionarios (23567,"João pessoal",20,2500,"Analista de Sistemas");
    Funcionarios f2 = new Funcionarios (27567,"Priscila soares",10,1500,"Marketing");
    Funcionarios f3 = new Funcionarios (26567,"Neves de almeida",30,2300,"Auxiliar de Produção");
    Funcionarios f4 = new Funcionarios (25567,"João Augusto",20,2800,"Analista de Sistemas");
    Funcionarios f5 = new Funcionarios (24567,"João Lindomar",20,3000,"Analista de Sistemas");
**/  public SetorPessoal(int qtdFunc)
    {
        func = new Funcionarios[qtdFunc];
    }
        public void adicionar( Funcionarios f)
        {
            for(int i =0; i < func.length; i++)
            {
                if (func[i] == null )
                {
                    func[i] = f;
                    i = func.length;
                }
            }
        }
        public void imprimirFolha()
        {
            for (int i =0; i < func.length; i++)
                
            {
                if (func[i] != null)
                {
                    System.out.println("Nome: "+ func[i].getNome()+ " - Salario: " + func[i].getSalario());
                }
                
            }
        }
        public double totalFolha()
        {
            double total = 0;
            for (int i =0; i < func.length; i++)    
            {
                if (func[i] != null)
                {
                    total = total + func[i].getSalario();
                }
                
            }
            return total;
        }
        public String maiorSal()               
        {
            int maior = 0;
            for (int i =0; i < func.length; i++)    
            {
                if (func[i] != null)
                {
                    if (func[maior].getSalario() < func[i].getSalario())
                    {
                        maior = i;
                    }
                }
                
            }
            return func[maior].getNome();
        }
        public void mostrarDept(int dept)
        {
            for (int i =0; i < func.length; i++)    
            {
                if (func[i] != null)
                {
                    if (func[i].getDepartamento() == dept)
                    {
                        System.out.println("Nome: " + func[i].getNome() + " - Cargo: " + func[i].getFuncao());
                    }
                }
                
            }
        
        }
        public void mostrarFunc(String cargo)
        {
             for (int i =0; i < func.length; i++)    
            {
                if (func[i] != null)
                {
                    if (func[i].getFuncao().equalsIgnoreCase(cargo))
                    {
                        System.out.println("Nome: " + func[i].getNome() + " - Função: " + func[i].getFuncao());
                    }
                }
                
            }
        }
}
