public class Operaciones {

    private int estreTotal;
    private String asterEstrella;

    public void estrellas (int sumaEst){
        estreTotal = sumaEst;
    }
    public String getEstrellas (){
        if (estreTotal==1) asterEstrella="*";
        if (estreTotal==2) asterEstrella="**";
        if (estreTotal==3) asterEstrella="***";
        return asterEstrella;

    }
}
