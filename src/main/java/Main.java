import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
/*
Concatenación

1. Si ambos operandos son númericos, el + significa suma o adición.
2. Si alguno de los operandos es String, el + significa concatenación.
3. La expresión de evalúa de izquierda a derecha.
 */
        var s= "1";
        s+="2";
        s+=3;
        System.out.println(s);


        //• La clase String tiene docenas de métodos.
        //• El String es una secuencia de caracteres. Inicia con el índice 0.
        //• String es inmutable.
        var nombre ="mauricio";

        //Obtener la longitud del String
        System.out.println(nombre.length());

        //Obtener un solo caracter
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        System.out.println(nombre.charAt(2));
        System.out.println(nombre.charAt(3));//Exception no encontro la posicion por que no existe

        //Encontrando el índice
        System.out.println(nombre.indexOf('r'));//busca la posicion de la letra especificada
        System.out.println(nombre.indexOf("ci"));


        //Obtener un SubString
        System.out.println(nombre.substring(4));//Obtiene los caracteres restantes del String "mauricio"

        //Ajustando los Case

        System.out.println(nombre.toUpperCase());//Mayusculas
        System.out.println("Abc123".toLowerCase());//Minusculas

        //Verificando la igualdad
        System.out.println("abc".equals("ABC"));//Verifica sí el 1er String es igual al 2do String, tomando en cuenta las mayus y minus.
        System.out.println("ABC".equals("ABC"));//Verifica sí el 1er String es igual al 2do String, tomando en cuenta las mayus y minus.
        System.out.println("abc".equalsIgnoreCase("ABC"));//Ignora las mayusculas y minusculas.


        String a = "abc";//= abc
        String b = a.toUpperCase();//=ABC
        b=b.replace("B","2");//=A2C
        b=b.replace('C','3');//=A23
        System.out.println("a="+a);//aA23
        System.out.println("b="+ b);//A23



    }
    //Bloque de inicializacion de instancia esta fuera del metodo main
    {
        System.out.println("este es un bloque de inicializacion de instancia");
    }
}