package clases;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
        String nombre;
        String genero = "";
        Arbol list_arbol = new Arbol();
        list_arbol.insertar("Brayan", "M");
        list_arbol.insertar("Miranda", "F");
        list_arbol.insertar("Ana", "F");
        list_arbol.insertar("Juan", "M");
        list_arbol.insertar("Luis", "M");
        list_arbol.insertar("Alicia", "F");
        list_arbol.insertar("Anibal", "M");

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar alguien al arbol\n"
                        + "2. Mostrar el arbol en innorden\n"
                        + "3. Mostrar el arbol en postorden\n"
                        + "4. Mostrar el arbol en preorden\n"
                        + "5. Mostrar parientes femeninos\n"
                        + "6. Salir \n"));
                switch (opcion) {
                    case 1:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese 1 si el genero es femenino o 2 si el genero es masculino "));
                        if (opcion == 1) {
                            genero = "F";
                        }
                        if (opcion == 2) {
                            genero = "M";
                        }
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre de la persona a agregar al arbol ");
                        list_arbol.insertar(nombre, genero);
                        break;
                    case 2:
                        System.out.println("Mostrando inorden del arbol:");
                        list_arbol.inorden();
                        break;

                    case 3:
                        System.out.println("\nMostrando postorden del arbol:");
                        list_arbol.postorden();
                        break;

                    case 4:
                        System.out.println("\nMostrando preorden del arbol:");
                        list_arbol.preorden();
                        break;

                    case 5:
                        System.out.println("\nMostrando progenitores mujeres: ");
                        list_arbol.progenitores_mujeres();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Gracias, vuelva pronto ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, ingrese una opción entre 1 y 6");
                        break;

                }
            } catch (NumberFormatException n) {
                if ("null".equals(n.getMessage())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR" + n.getMessage());
                }
            }
        } while (opcion != 6);
    }
}
