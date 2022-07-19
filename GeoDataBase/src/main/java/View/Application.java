
package View;

import java.util.Date;
import java.util.List;
import model.MunicipioService;
import model.Municipio;
import util.JPAUtil;
import model.Ferrovia;
import model.FerroviaService;
import model.Aeroporto;
import model.AeroportoService;
import model.Estado;
import model.EstadoService;
import model.Porto;
import model.PortoService;
import model.Microrregioes;
import model.MicrorregioesService;
import model.Pais;
import model.PaisService;



public class Application {
    public static void main(String[] args) {
       
      
       //1 - Listar Ferrovias
       FerroviaService ferroviaService = new FerroviaService();
       
       List<Ferrovia> ferrovia = ferroviaService.listarFerrovia();
       for (Ferrovia f: ferrovia){
            System.out.println(f);
       } 
       
    
       //2 - Listar ferrovias que atravessam São Luís
       FerroviaService fe = new FerroviaService();
        List<Ferrovia> ferrovias = fe.ferroviacortaslz("São Luís");
       for (Ferrovia f: ferrovias){
           System.out.println(f);
       }
       
      //3 - Listar estados do Brasil
       EstadoService estadoService = new EstadoService();
       
       List<Estado> estados = estadoService.estadosbr();
       for (Estado e: estados){
            System.out.println(e);
       }
       
       //4-Portos Localizados no maranhão
       PortoService portoService = new PortoService();
       List<Porto> portos = portoService.listarPortos("Maranhão");
       for (Porto p: portos){
           System.out.println(p);
       }
       
        //5 - Distância entre Portos de São Luís e Recife
       PortoService portod = new PortoService();
       double distancia = portod.distanciaentreporto("São Luís", "Recife");
       System.out.printf("dsitancia em km: %.2f", distancia / 1000);
       
       
       //6 - Ferrovias Operadas pela VALE
       FerroviaService op = new FerroviaService();
       List<Ferrovia> fr = op.listaroperadora("VALE");
       for (Ferrovia f: fr){
           System.out.println(f);
       }
       
        //7 - Aeroportos que intersectam a região NORDESTE
       AeroportoService aeroportoService = new AeroportoService();
       List<Aeroporto> aeroportos = aeroportoService.aeroportosint("Nordeste");
       for (Aeroporto p: aeroportos){
           System.out.println(p);
       }
       
       //8 - Microregiões de Imperatriz - MA
       MicrorregioesService microrregioesService = new MicrorregioesService();
       List<Microrregioes> micrope = microrregioesService.municipiosmicrorregiao("MA", "Imperatriz");
       for (Microrregioes mz: micrope){
            System.out.println(mz);
       }
       
       
       //9 - Consultar Area e Geometria do Brasil
       PaisService paisService = new PaisService();
       
       List<Pais> pais = paisService.listararea();
       for (Pais p: pais){
            System.out.println(p);
       }
       
       //10 - Consultar estados vizinhos    
       EstadoService est = new EstadoService();
       List<Estado> esta = est.listarestadosvizinhos("Maranhão");
       for (Estado e: esta){
            System.out.println(e);
       }
      
       
       
       JPAUtil.close();
    }
}
