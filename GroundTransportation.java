
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        // inicializa variáveis de instância
        this.licensePlate = licensePlate;
        setFees(3.0);

    }

    /**
     * @method getLicensePlate / setLicensePlate - Guardam a matricula
     * @param licensePlate - String que contêm a matricula 
     */
    
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        if (licensePlate != null) {
            this.licensePlate = licensePlate;
        }
    }
    
    public double getPriceWithFees(){
        return getPrice() * (1.0 + (getFees() * 0.01));
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString(){
        return super.toString() + "      Matricula: " + licensePlate + "\n";
    }
}
