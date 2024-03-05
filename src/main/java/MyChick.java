public class MyChick {

    private String nombre = "salsa";//Variable de instancia

/*
cual se imprime primero?
1- Los bloques de inicializacion de instancia
2-Al final los constructores
 */

    {//Bloque de incializacion de instancia
        System.out.println("1");
    }


    //Contructor
    public MyChick() {
        nombre = "cambio de nombre";
        System.out.println("2");
    }

    public static void main(String[] args) {
        MyChick chick = new MyChick();
        System.out.println(chick.nombre);
    }


}

