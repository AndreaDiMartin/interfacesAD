import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Empleado john = new Empleado();
        john.nombre = "John";
        john.edad = 40;
        john.salario = 1000;
        john.hasSubordinates = true;
        Empleado A = new Empleado();
        A.nombre = "Andy";
        A.salario = 500;
        A.edad = 28;
        A.hasSubordinates = true;
        Empleado B = new Empleado();
        B.nombre = "Barry";
        B.edad = 50;
        B.salario = 500;
        B.hasSubordinates = false;
        Empleado C = new Empleado();
        C.nombre = "Colton";
        C.edad = 51;
        C.salario = 100;
        C.hasSubordinates = true;
        Empleado D = new Empleado();
        D.nombre = "Daryl";
        D.edad = 18;
        D.salario = 100;
        D.hasSubordinates = false;
        A.Subordinado = new Empleado[]{C};
        C.Subordinado = new Empleado[]{D};
        john.Subordinado = new Empleado[]{A, B};
        System.out.println(john.oficinarecursive(john.salario, john.edad));
        System.out.println(john.oficinaiterativo());

        Empleado L = new Empleado();
        L.nombre = "Louie";
        L.salario = 8000;
        L.edad = 30;
        L.hasSubordinates = true;
        Empleado M = new Empleado();
        M.nombre = "Maria";
        M.edad = 20;
        M.salario = 5000;
        M.hasSubordinates = true;
        Empleado N = new Empleado();
        N.nombre = "Nancy";
        N.salario = 2000;
        N.edad = 31;
        N.hasSubordinates = true;
        Empleado O = new Empleado();
        O.nombre = "Owen";
        O.salario = 1000;
        O.edad = 18;
        O.hasSubordinates = false;
        L.Subordinado = new Empleado[] {M};
        M.Subordinado = new Empleado[] {N};
        N.Subordinado = new Empleado[] {O};
        System.out.println(L.oficinarecursive(L.salario, L.edad));
        System.out.println(L.oficinaiterativo());




    }
}
