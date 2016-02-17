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
public class Funcionarios 
{
    private int matricula;
    private String nome;
    private int departamento;
    private double salario;
    private String funcao;
    
    public Funcionarios(int matricula, String nome, int departamento, double salario, String funcao)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.funcao = funcao;
    
    }
    public int getMatricula(){
        return matricula;
    }        
    public String getNome()
    {
        return nome;
    }
    public int getDepartamento()
    {
        return departamento;
    }
    public double getSalario()
    {
        return salario;
    }
    public String getFuncao()
    {
        return funcao;
    }
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public void setDepartamento(int departamento)
    {
        this.departamento = departamento;
    }
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }
    
}
