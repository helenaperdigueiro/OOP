package aula01.aulapg;

public class Main {
    public static void main(String[] args) { //nos nossos programas a gente sempre vai ter esse void main que eh um metodo que permite rodar o programa.
        //esse public static void main roda sem a gente ter que chamar e o nosso codigo sempre fica dentro dele. Sem isso o play nem aparece.
        //void significa que nao retorna nada.

        System.out.println("Hello world!"); //o console.log() do JS
        System.out.println(showMessage()); //o Java nao eh linear como o JS. Quando voce chama uma funcao ele procura no codigo inteiro.
        //Temos que chamar os metodos sempre aqui dentro

        int valor1=15;
        float banana;
        banana = (float)valor1/2; //casting = transformar em float momentaneamente.
        System.out.println(banana);
        //soh testando os exemplos do pg
//        let nomeDaVariavel = "Hello world!";
        String nomeDaVariavel = "Hello world!";
        int nomeDaVarialvel2 = 10;

    }
    public static String showMessage() { //quando coloquei String eu disse que esse metodo chamado showMessage vai retornar uma string.
        String myMessage = "Hello world inside a method!"; //criei uma variavel do tipo String.
        return myMessage;
    }
}

