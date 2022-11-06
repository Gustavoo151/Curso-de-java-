public class VariaveisChar {
    public static void main(String[] args){
        char letraa = 'a';
        char letraAscii = 97;
        char interrogacao = 0X00E1;

        System.out.println("Char => Letra a = " + letraa);
        System.out.println("Char => Letra a ASCII (97) = " + letraAscii);
        System.out.println("Interrogacao - " + interrogacao);
        System.out.println(letraa + letraa); // Se tentar printar as duas palavras só usando o +, o java vai fazer uma soma é não vai dar o resultado
        System.out.println("" + letraa + letraa);  // Para imprimir duas letras basta colocar uma ""

        /*______________________________________________________
         * Sequência de Escape   |     Descrição                |
         *------------------------------------------------------|
         *      \t               |        tab                   |
         *      \b               |        backspace             |
         *      \n               |        nova linha            |
         *      \r               |        retorno do carro      |
         *      \f               |        avanço de página      |
         *      \'               |        aspas simples         |
         *      \"               |        aspas duplas          |
         *      \\               |        barra invertida       |
         *      \ddd             |        constante octal       |
         *      \ uxxxx          |        Constante haxadecimal |
         * ------------------------------------------------------
         */

    }
}