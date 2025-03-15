package edu.infnet.rachelpizane.questao01;


public class App 
{
    public static void main( String[] args ) {
        Pessoa ana = new Pessoa("Ana Luiza", 33);

        System.out.println("CONHECENDO ANA ====================");
        System.out.println(ana.saudacao());

        ana.fazerAniversario();
        
        System.out.println(ana.saudacao());
    }
}
