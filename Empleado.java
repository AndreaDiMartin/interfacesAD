import java.util.Arrays;
import java.util.ArrayList;

public  class Empleado {

    String nombre;
    int edad;
    int salario;
    Empleado[] Subordinado;
    boolean hasSubordinates;


    public int oficinarecursive(int salarioJefe,int edadJefe) {
        int cantidad = 0;
        for (int i = 0; i < Subordinado.length; i++) {
            if (Subordinado[i].edad > edadJefe && Subordinado[i].salario < salarioJefe) {
                cantidad = cantidad + 1;
            }
            if (Subordinado[i].hasSubordinates == true) {
                cantidad = cantidad + Subordinado[i].oficinarecursive(salarioJefe,edadJefe);
            }
        }
        return cantidad;
    }

    public int oficinaiterativo() {
        int cantidad = 0;
        MyQueue coladeSubordinados = new MyQueue();
        int i = 0;
        int largodesubordinados = Subordinado.length;
        while(true) {
            if(i<largodesubordinados) {
                coladeSubordinados.addEmpleado(Subordinado[i]);
                i = i+1;
            }
            Empleado sub = coladeSubordinados.poll();
            if (sub.edad > edad && sub.salario < salario) {
                cantidad = cantidad + 1;
            }
            if(sub.hasSubordinates == true){
                    for(int j =0; j<sub.Subordinado.length;j++){
                        coladeSubordinados.addEmpleado(sub.Subordinado[j]);
                    }
            } else if (i>=largodesubordinados && coladeSubordinados.size()==0) {
                return cantidad;

            }

        }

    }


    public static void main(String[] args) {


    }

}