public class tiposDeDatos {
    public static void demostrarTipos(){
        System.out.println("demo de los datos");
        enlase<Integer> listamonkeisxdxd = new enlase<>(1);
        listamonkeisxdxd.appendNode(5);
        listamonkeisxdxd.appendNode(6);
        listamonkeisxdxd.appendNode(7);
        listamonkeisxdxd.appendNode(67);
        System.out.println("lista de numeros: ");
        listamonkeisxdxd.showList();

        enlase<String> listacomplejos = new enlase<>(1);
        listacomplejos.appendNode("hola");
        listacomplejos.appendNode("waos");
        listacomplejos.appendNode("niggers");
        System.out.println("lista de palabras: ");
        listacomplejos.showList();

        enlase<Alumnos> listaAbstracto = new enlase<>(1);
        listaAbstracto.appendNode(new Alumnos("Alberto", "4442475412", "AL03028732", "a@gmail.com"));
        listaAbstracto.appendNode(new Alumnos("Firulais", "4442475413", "AL03028733", "b@gmail.com"));
        listaAbstracto.appendNode(new Alumnos("MArvin", "4442475414", "AL03028734", "c@gmail.com"));
        System.out.println("lista de alumnos: ");
        listaAbstracto.showList();
    }

}
