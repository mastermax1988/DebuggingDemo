import java.util.ArrayList;
import java.util.List;

public class Fuhrpark {

  private List<Auto> autos;

  public Fuhrpark(){
    autos = new ArrayList<>();
  }
  public void addAuto(Auto a){
    autos.add(a);
  }

  public void printAutos(){
    for(Auto a : autos){
      printAuto(a);
    }
  }

  public void printAuto(int index){
    printAuto(autos.get(index));
  }

  private void printAuto(Auto auto){
    System.out.println(auto.getModell() + ", " + auto.getFarbe());
  }
}
