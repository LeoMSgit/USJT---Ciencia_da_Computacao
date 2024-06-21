package aula0904oo;

public class Aluno {
  private String ra;
  private String nome;
  
  public Aluno(){
    this.ra = "123451";
    this.nome = "Bora Bil da Silva";
  }
  public Aluno(String ra, String nome){
      this.ra = ra;
      this.nome = nome;
  }
  
  public void setRa(String ra){
      this.ra = ra;
  }
  public String getRa(){
      return this.ra;
  }
  public void setNome(String nome){
      this.nome = nome;
  }
  public String getNome(){
      return this.nome;
  }
  
}
