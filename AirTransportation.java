
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int numberOfContainers;

    
    /**
     * Construtor para objetos da classe AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        // inicializa variáveis de instância
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(4.0);
    }
    
    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getName()
    {
        return this.name;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public void setName(String name){
        if (name != null) {
                this.name = name;
            }
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if (numberOfContainers >= 0){
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public double getPriceWithFees(){
        return getPrice() * (1.0 + (getFees() * 0.01));
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    @Override
    public String toString(){
        return super.toString() + "           Nome: " + name + "\n  NºContentores: " + numberOfContainers + "\n";
    }
}
