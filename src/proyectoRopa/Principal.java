package proyectoRopa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import proyectoRopa.Ropa;

public class Principal {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("agregrar cambios");

		Scanner lectura=null;
		 String clave;
		 String marca;
		 float precio;
		 int existencia;
		 
		 Ropa ropa=null;
		 
		 List<Ropa> listaRop = new ArrayList<Ropa>();
		 
		 int menuPric, subMenu, indice ;
		 
		 do {
			 System.out.println("Menu principal");
			 System.out.println("1----alta de producto");
			 System.out.println("2----MOSTRAR");
			 System.out.println("3----BUSCAR POR INDICE");
			 System.out.println("4----EDITAR POR INDICE");
			 System.out.println("5----ELIMINAR");
			 System.out.println("6----CALCULAR EL DINERO INVERTIDO");
			 System.out.println("7----BUSCAR POR NOMBRE DEL PRODUCTO");
			 System.out.println("8----BUSCAR POR MARCA ");
			 System.out.println("9----ELIMINAR POR NOMBRE");
			 System.out.println("10----SALIR");
			 lectura= new Scanner(System.in);
			menuPric = lectura.nextInt();
			
			switch(menuPric) {
			case 1:
				try {
					System.out.println("Ingresa la clave");
					 lectura= new Scanner(System.in);
					 clave= lectura.nextLine();
							 
					 System.out.println("Ingresa la marca");
					 lectura= new Scanner(System.in);
					 marca= lectura.nextLine();
					 
					 System.out.println("Ingresa el precio");
					 lectura= new Scanner(System.in);
					 precio= lectura.nextFloat();
					 
					 System.out.println("Ingresa la existencia");
					 lectura= new Scanner(System.in);
					 existencia= lectura.nextInt();
					 
					
						//formar el objeto---- utlizar el constructor con su paramtro 
					 ropa = new Ropa(clave, marca, precio, existencia) ;
					 
					 //agregar elementos ala lista
					 listaRop.add(ropa);
					 System.out.println("se guardo correctamente");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("error al guardar" + e.getMessage());
				}
				 
			  		 
				break;
			case 2:
				System.out.println(listaRop);
				break;
			case 3:
				System.out.println("Registros por indice");
				for(int i=0; i<listaRop.size();i++) {
					System.out.println("["+ i +"]" + listaRop.get(i).getMarca());
				}
				try {
					System.out.println("ingrese el indice a buscar");
					lectura= new Scanner(System.in);
					indice= lectura.nextInt();
					
					//buscar
					ropa=listaRop.get(indice);
					System.out.println(ropa);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("error al guardar" + e.getMessage());
				}
				
				
				break;
			case 4:
				System.out.println("Registros por indice");
				for(int i=0; i<listaRop.size();i++) {
					System.out.println("["+ i +"]" + listaRop.get(i).getMarca());
				}
				try {
					System.out.println("ingrese el indice a buscar");
					lectura= new Scanner(System.in);
					indice= lectura.nextInt();
					
					//buscar
					ropa=listaRop.get(indice);
					System.out.println(ropa);
					
					//editar MARCA,EXISTENCIA
					do {
						System.out.println("MENU PARA EDITAR");
						System.out.println("1----MARCA");
						System.out.println("2----EXISTENCIA");
						System.out.println("3----REGRESAR");
						lectura= new Scanner(System.in);
						subMenu= lectura.nextInt();
						
						switch(subMenu) {
						case 1:
							System.out.println("ingrese la nueva marca");
							lectura= new Scanner(System.in);
							marca=lectura.nextLine();
							
							//actualizacion
							ropa.setMarca(marca);
							System.out.println("se actualizo con exito");
							break;
						case 2:
							System.out.println("ingrese la nueva existencia");
							lectura= new Scanner(System.in);
							existencia=lectura.nextInt();
							
							//actualizacion
							ropa.setExistencia(existencia);
							System.out.println("se actualizo con exito");
							break;
						
						case 3:
							
							break;
						}
					} while (subMenu <3);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("error al guardar" + e.getMessage());
				}
				break;
			case 5:
				for(int i=0; i<listaRop.size();i++) {
					System.out.println("["+ i +"]" + listaRop.get(i).getMarca());
				}
				
				System.out.println("ingrese el indice a eliminar");
				lectura= new Scanner(System.in);
				indice= lectura.nextInt();
				//elminacion
				listaRop.remove(indice);
				System.out.println("se elimino con exito");
				
				break;
			case 6:
				float total = 0  ;
		        for (Ropa rop : listaRop) {
		            total += rop.getExistencia() * rop.getPrecio();
		        }

		        // Mostrar el total
		        System.out.println("El total gastado es: $" + total);
				break;
			case 7:
				boolean banderacompu = false; 
				System.out.print("Ingrese el nombre del producto: ");
		        String marcaBuscada = lectura.nextLine();
		        for (Ropa rop : listaRop) {
		            if (ropa.getMarca().equalsIgnoreCase(marcaBuscada)) {  // Comparar sin considerar mayúsculas/minúsculas
		                System.out.println("Se encontró: " + ropa);  // Imprimir la computadora encontrada
		                banderacompu = true;
		            }
		        }
		        if (!banderacompu) {
		            System.out.println("No existe el registro");
		        }
				
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			}	
			
		 }while(menuPric < 10);
			
			
		
		 
	}	

}
