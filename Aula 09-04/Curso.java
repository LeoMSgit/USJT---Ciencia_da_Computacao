package aula0904oo;

public class Curso {
    private int codigo;
    private String nome;
    private String periodo;
   
    public Curso(){
    this.codigo = 1515;
    this.nome = "Curso de Java";
    this.periodo = "Primeiro";
  }

    Curso(int codigo_novo_curso, String nome_novo_curso, String periodo_novo) {
    this.codigo = codigo_novo_curso;
    this.nome = nome_novo_curso;
    this.periodo = periodo_novo;
}

    public void setCodigo(int codigo){
      this.codigo = codigo;
  }
    public void setNome(String nome){
      this.nome = nome;
  }
    public void setPeriodo(String periodo){
      this.periodo = periodo;
  }
    public int getCodigo(){
      return this.codigo;
    }
    public String getNome(){
      return this.nome;
    }
    public String getPeriodo(){
      return this.periodo;
    }
      
    
}
