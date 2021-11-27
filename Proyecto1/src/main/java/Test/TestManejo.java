
package Test;


import Controlador.*;
import Modelo.*;
import java.util.List;

public class TestManejo {
    public static void main(String[] args) {
        
      
        ZapatoDAO zapatoDao = new ZapatoDAO();
        Zapato zapatoNew = new Zapato(31,"gris",4,"zapatillas");
        zapatoDao.insertar(zapatoNew);
        List<Zapato> zapatos=zapatoDao.seleccionar();
        zapatos.forEach(zapato->{
            System.out.println("zapato = " + zapato);
        });
        
//        CamisaDAO camisaDao = new CamisaDAO();
//        Camisa camisaNew = new Camisa("XL","negro",3,"classic fit porque toy gordito :c");
//        camisaDao.insertar(camisaNew);
//        List<Camisa> camisas=camisaDao.seleccionar();
//        camisas.forEach(camisa->{
//            System.out.println("camisa = " + camisa);
//        });
//        
//        PantalonDAO pantalonDao = new PantalonDAO();
//        Pantalon pantalonNew = new Pantalon(42,"negro",2,"mocho");
//        pantalonDao.insertar(pantalonNew);
//        List<Pantalon> pantalones=pantalonDao.seleccionar();
//        pantalones.forEach(pantalon->{
//            System.out.println("pantalon = " + pantalon);
//        });
//        
        
        
        
        
        
        
    }
}
