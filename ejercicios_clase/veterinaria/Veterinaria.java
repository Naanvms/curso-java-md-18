package ejercicios_clase.veterinaria;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String args[]) {
        Operaciones operacionesBD = new Operaciones();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Ingresa el id de la acción.\n1. Obtener todos los registros\n2. Insertar nuevo registro.\n3. Actualizar un registro\n4. Eliminar un Registro");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                operacionesBD.obtenerMascotas();
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Insertar nuevo animalito");
                System.out.println("Ingresa el nombre de la mascota");
                String nombreMascota = scanner.nextLine();
                System.out.println("Ingresa la raza de la mascota");
                String raza = scanner.nextLine();
                System.out.println("Ingresa el nombre del propietario");
                String nombrePropietario = scanner.nextLine();
                System.out.println("Ingresa el servicio");
                String servicio = scanner.nextLine();
                operacionesBD.guardarMascota(nombreMascota, raza, nombrePropietario, servicio);
                break;
            case 3:
                System.out.println("Actualizar información de un animalito");
                scanner.nextLine();
                System.out.println("Ingresa el id del animalito a actualizar");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa el nombre de la mascota");
                nombreMascota = scanner.nextLine();
                System.out.println("Ingresa la raza de la mascota");
                raza = scanner.nextLine();
                System.out.println("Ingresa el nombre del propietario");
                nombrePropietario = scanner.nextLine();
                System.out.println("Ingresa el servicio");
                servicio = scanner.nextLine();
                operacionesBD.actualizarMascota(id, nombreMascota, raza, nombrePropietario, servicio);
                break;
            case 4:
                System.out.println("Eliminar animalito");
                System.out.println("Ingresa el id del animalito a eliminar");
                int idEliminar = scanner.nextInt();
                operacionesBD.eliminarMascota(idEliminar);
                break;
            default:
                // System.out.println("Opción no válida");
                System.out.println("Ingresa el id del animalito que buscas");
                int idBuscar = scanner.nextInt();
                operacionesBD.buscarMascota(idBuscar);
                break;
        }
    }
}
